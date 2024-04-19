package com.example.demo.test.counterpartyoption.service;


import ch.qos.logback.core.encoder.EchoEncoder;
import com.example.demo.test.clientreview.service.Clientreviewservice;
import com.example.demo.test.http.HttpUtils;
import model.ClientReviewRecord;
import model.CounterpartyProdMonitorFlow;
import model.OtcDerivativeCounterparty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import sql.AuserMapper;
import sql.ClientReviewRecordMapper;
import sql.CounterpartyProdMonitorFlowMapper;
import sql.OtcDerivativeCounterpartyMapper;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CounterpartyOptionServiceImpl implements CounterpartyOpionService {

    private final static Logger log = LoggerFactory.getLogger(CounterpartyOptionServiceImpl.class);

    @Resource
    private OtcDerivativeCounterpartyMapper otcDerivativeCounterpartyMapper;

    @Resource
    private CounterpartyProdMonitorFlowMapper counterpartyProdMonitorFlowMapper;

    @Resource
    private ClientReviewRecordMapper clientReviewRecordMapper;

    @Resource
    private AuserMapper auserMapperl;

    @Autowired
    private Clientreviewservice clientreviewservice;

    public List<String> createFlow(String corporateName, String customerManager) throws Exception {
        log.info("公司名称:{},客户经理:{}", corporateName, customerManager);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String current_date = simpleDateFormat.format(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-153);
        Date newdate = calendar.getTime();
        try {
             Boolean flag = clientreviewservice.checkCorporation(corporateName);
             if(!flag){throw new Exception("该公司不存在");}
             String userId = clientreviewservice.checkCustomer(customerManager).get(0).getUserid();
             String deptCode = clientreviewservice.checkCustomer(customerManager).get(0).getDeptCode();
//设置满足流程的条件
             OtcDerivativeCounterparty otcDerivativeCounterparty = new OtcDerivativeCounterparty();
             otcDerivativeCounterparty.setCorporateName(corporateName);
             otcDerivativeCounterparty.setCustomerManager(userId);
             otcDerivativeCounterparty.setIntroductionDepartment(deptCode);
             otcDerivativeCounterparty.setAmlMonitorFlag("true");
             otcDerivativeCounterparty.setClientQualifyReview("true");
             otcDerivativeCounterparty.setAllowBusiType("OPTION,TRS,PRODUCT");
             otcDerivativeCounterpartyMapper.updateByCorporatename(otcDerivativeCounterparty);
//查出存量流程并且进行处理
            List<OtcDerivativeCounterparty> clientIdList = new ArrayList<>();
            clientIdList = otcDerivativeCounterpartyMapper.selectAll(corporateName);
            clientIdList.forEach(clientId ->{
                counterpartyProdMonitorFlowMapper.deleteByPrimaryKey(String.valueOf(clientId.getClientId()));
            });

//处理回访流程
            List<ClientReviewRecord> flowList =  clientReviewRecordMapper.selectflownum(corporateName);
            List<String> idList= flowList.stream().map(ClientReviewRecord::getId).collect(Collectors.toList());
            ClientReviewRecord clientReviewRecord = new ClientReviewRecord();
            for(String id: idList){
                clientReviewRecord.setId(id);
                clientReviewRecord.setCurrentStatus("CLOSED");
                clientReviewRecordMapper.updateByPrimaryKeySelective(clientReviewRecord);

            }
            String url ="http://10.2.145.216:9090/api/test/optionProdMonitor";


            clientIdList.forEach(count ->{
                Map<String,String> params = new HashMap<>();
                params.put("clientId",count.getClientId());
                params.put("date",current_date);
                String rensponse = HttpUtils.get(url,params);
                log.info(rensponse);
            });

            idList.forEach(id ->{
                ClientReviewRecord recover = new ClientReviewRecord();
                recover.setId(id);
                recover.setCurrentStatus("PROCESSING");
                clientReviewRecordMapper.updateByPrimaryKeySelective(recover);
            });

            List<CounterpartyProdMonitorFlow> flowList1 = new ArrayList<>();
            flowList1 = counterpartyProdMonitorFlowMapper.selectFlow(corporateName);
            List<String> titleList = flowList1.stream().map(CounterpartyProdMonitorFlow::getTitle).collect(Collectors.toList());
            log.info(titleList.toString());
            return titleList;

        } catch (Exception e) {
            log.info(e.toString());
            throw new Exception(e);
        }



    }
}

