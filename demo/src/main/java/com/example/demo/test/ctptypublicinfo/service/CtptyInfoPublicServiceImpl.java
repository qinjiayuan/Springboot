package com.example.demo.test.ctptypublicinfo.service;

import com.example.demo.test.http.HttpUtils;
import model.Auser;
import model.CounterpartyOrg;
import model.CtptyInfoUpdateRecord;
import model.OtcDerivativeCounterparty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sql.AuserMapper;
import sql.CounterpartyOrgMapper;
import sql.CtptyInfoUpdateRecordMapper;
import sql.OtcDerivativeCounterpartyMapper;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CtptyInfoPublicServiceImpl implements CtptyInfoPublicService {

    static Logger log = LoggerFactory.getLogger(CtptyInfoPublicServiceImpl.class);

    @Resource
    private OtcDerivativeCounterpartyMapper otcDerivativeCounterpartyMapper;

    @Resource
    private CtptyInfoUpdateRecordMapper ctptyInfoUpdateRecordMapper;

    @Resource
    private CounterpartyOrgMapper counterpartyOrgMapper;

    @Resource
    private AuserMapper auserMapper;

    public List<String> processjob(String customerManager) throws Exception{
        String unifiledsocialcode = "911101080828461726";
        String corporateName ="云合资本管理(北京)有限公司";
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String today = simpleDateFormat.format(date);

        try{
            List<Auser> manager = new ArrayList<>();
            manager = auserMapper.selectExists(customerManager);
            if(manager.isEmpty()||null==manager){
                throw new Exception("客户经理不存在，请确认输入的客户经理的中文名称");
            }

            CounterpartyOrg counterpartyOrg = new CounterpartyOrg();
            counterpartyOrg.setCorporateName(corporateName);
            counterpartyOrg.setAmlMonitorFlag("true");
            counterpartyOrg.setCustomerManager(manager.get(0).getUserid());
            counterpartyOrg.setIntroductionDepartment(manager.get(0).getDeptCode());
            counterpartyOrgMapper.updateByPrimaryKeySelective(counterpartyOrg);

            OtcDerivativeCounterparty otcDerivativeCounterparty = new OtcDerivativeCounterparty();
            otcDerivativeCounterparty.setCorporateName(corporateName);
            otcDerivativeCounterparty.setUnifiedsocialCode(unifiledsocialcode);
            otcDerivativeCounterparty.setAmlMonitorFlag("true");
            otcDerivativeCounterparty.setIntroductionDepartment(manager.get(0).getDeptCode());
            otcDerivativeCounterparty.setCustomerManager(manager.get(0).getUserid());
            otcDerivativeCounterpartyMapper.updateByCorporatename(otcDerivativeCounterparty);

//            处理存量流程
            List<CtptyInfoUpdateRecord> now_flow = new ArrayList<>();
            now_flow = ctptyInfoUpdateRecordMapper.selectByPrimaryKey();
            List<String> flowId = now_flow.stream().filter(flow ->"PROCESSING".equals(flow.getCurrentStatus()) && !flow.getTitle().contains("台账复核") )
                    .map(CtptyInfoUpdateRecord::getId)
                    .collect(Collectors.toList());
            for(String id :flowId){
                ctptyInfoUpdateRecordMapper.deleteByPrimaryKey(id);
            }

            String url = "http://10.2.145.216:9090/ctptyInfoUpdate/remind/check";
            Map<String,String> params = new HashMap<>();
            params.put("checkDayAfter","2010-10-10");
            params.put("checkDbData","false");
            params.put("checkInDate","2022-08-31");
            params.put("isNewCheck","true");
            params.put("startProcess","true");
            params.put("today",today);
            params.put("uniCodeList","911101080828461726");

            log.info("url :{}",url);
            log.info("params :{}",params);
            String response = HttpUtils.postMap(url,params);
            log.info(response);

            List<CtptyInfoUpdateRecord> flowList = new ArrayList<>();
            flowList =ctptyInfoUpdateRecordMapper.selectByPrimaryKey();
            List<String> title = flowList.stream().filter(flow ->
                    !flow.getTitle().contains("台账复核")).
                    map(CtptyInfoUpdateRecord::getTitle).collect(Collectors.toList());
            log.info(title.toString());
            return title;


        }
        catch (Exception e){
            log.info(e.toString());
            throw e;
        }
    }
}
