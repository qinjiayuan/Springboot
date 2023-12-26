package com.example.demo.test.certificates.service;

import com.alibaba.druid.pool.PreparedStatementPool;
import com.example.demo.test.clientreview.service.Clientreviewservice;
import com.example.demo.test.http.HttpUtils;
import model.*;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sql.*;

import javax.annotation.Resource;


import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Exception.class)
public class Certificatesserviceimpl implements Certificateservice {

    private static Logger log = LoggerFactory.getLogger(Certificatesserviceimpl.class);

    @Resource
    private OtcDerivativeCounterpartyMapper otcDerivativeCounterpartyMapper;

    @Resource
    private AmlBeneficiaryMapper amlBeneficiaryMapper;

    @Resource
    private AmlCounterpartyMapper amlCounterpartyMapper;

    @Resource
    private CounterpartyOrgMapper counterpartyOrgMapper;

    @Resource
    private CrtExpiredRecordMapper crtExpiredRecordMapper;

    @Resource
    private CrtExpiredRecordUnionMapper crtExpiredRecordUnionMapper;

    @Autowired
    private Clientreviewservice clientreviewservice;

    @Resource
    private CrtExpiredPersonRecordMapper crtExpiredPersonRecordMapper;

    public void addBeneficiary(String corporateName,String customerManager)  throws Exception {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DATE,30);
        Date newDate = calendar.getTime();

        String end_day = simpleDateFormat.format(newDate);
        log.info("流程的发起时间是{}",newDate);

        List<OtcDerivativeCounterparty> counterpartyList = new ArrayList<>();

        counterpartyList = otcDerivativeCounterpartyMapper.selectClient();
        List<String> clientIdList = counterpartyList.stream().filter(clientId -> corporateName.equals(clientId.getCorporateName())).map(OtcDerivativeCounterparty::getClientId).collect(Collectors.toList());
        List<String> unifiledsocialCode = counterpartyList.stream().filter((unifiled-> corporateName.equals(unifiled.getCorporateName()))).map(OtcDerivativeCounterparty::getUnifiedsocialCode).collect(Collectors.toList());

        String  socialCode = unifiledsocialCode.get(0);
        clientIdList.forEach(client ->{
            List<AmlCounterparty> gh  =  amlCounterpartyMapper.selectAll(client);
            List<String> counterpartyId = gh.stream().map(AmlCounterparty::getId).collect(Collectors.toList());
            List<OtcDerivativeCounterparty> productName = otcDerivativeCounterpartyMapper.selectSignatureNameByClientIdString(client);//可能存在bug
            log.info("客户编号{}",client);
//            若AMLcounterparty不存在，那么受益人必定为空
            if(counterpartyId.isEmpty() || null==counterpartyId){
                String id = clientreviewservice.getid();
                AmlCounterparty addAmlcounterparty = new AmlCounterparty();
                addAmlcounterparty.setId(id);
                addAmlcounterparty.setClientName(corporateName);
                addAmlcounterparty.setOrganType("0");
                addAmlcounterparty.setCreator("sunbin");
                addAmlcounterparty.setCreateTime(today);
                addAmlcounterparty.setIdNo(socialCode);
                addAmlcounterparty.setVersion(Short.valueOf("1"));
                addAmlcounterparty.setIdKind("business_license");
                addAmlcounterparty.setClientId(client);
                addAmlcounterparty.setProdname(productName.get(0).getSignatureName());
                amlCounterpartyMapper.insertSelective(addAmlcounterparty);

//                接下来创建受益人
                AmlBeneficiary add_1 = new AmlBeneficiary();
                add_1.setName("回访9527");
                add_1.setId(clientreviewservice.getid());
                add_1.setIdKind("0");
                add_1.setBirth("1990-10-10");
                add_1.setGender("Female");
                add_1.setClientKind("F");
                add_1.setIdValiddateStart("1990-10-10");
                add_1.setIdValiddateEnd(end_day);
                add_1.setCounterpartyId(id);
                add_1.setCategory("1");
                log.info("已完成受益人的添加");
                amlBeneficiaryMapper.insertSelective(add_1);
            }
            else {
                for (String counterpartyid : counterpartyId) {
                    List<AmlBeneficiary> person = new ArrayList<>();
                    person = amlBeneficiaryMapper.selectAll(counterpartyid);
                    List<AmlBeneficiary> type_1 = person.stream().filter(cds -> "1".equals(cds.getCategory())).collect(Collectors.toList());
                    if (!type_1.isEmpty()) {
                        AmlBeneficiary updateinfo = new AmlBeneficiary();
                        updateinfo.setName("回访9527");
                        updateinfo.setId(clientreviewservice.getid());
                        updateinfo.setBirth("1990-10-10");
                        updateinfo.setIdValiddateStart("1990-10-10");
                        updateinfo.setIdValiddateEnd(end_day);
                        updateinfo.setId(type_1.get(0).getId());
                        amlBeneficiaryMapper.updateByPrimaryKeySelective(updateinfo);
                    }
                    else{
                        AmlBeneficiary add_1 = new AmlBeneficiary();
                        add_1.setName("回访9527");
                        add_1.setId(clientreviewservice.getIdNo());
                        add_1.setIdKind("0");
                        add_1.setBirth("1990-10-10");
                        add_1.setGender("Female");
                        add_1.setClientKind("F");
                        add_1.setIdValiddateStart("1990-10-10");
                        add_1.setIdValiddateEnd(end_day);
                        add_1.setCounterpartyId(counterpartyid);
                        log.info("已完成受益人的添加");
                        amlBeneficiaryMapper.insertSelective(add_1);
                    }

                }
            }
        });


    }

    @Override
    public List<String> createFlow(String corporateName , String customerManager) throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        log.info("流程的发起时间是{}",today);
        String checkDay = simpleDateFormat.format(today);
        //查询机构是否存在
        boolean exesistFlag = clientreviewservice.checkCorporation(corporateName);
        if(!exesistFlag){throw new Exception("公司不存在");}
//        查询客户经理的部门的用户名
        String userId = clientreviewservice.checkCustomer(customerManager).get(0).getUserid();
        String deptCode = clientreviewservice.checkCustomer(customerManager).get(0).getDeptCode();

        addBeneficiary(corporateName,customerManager);

        OtcDerivativeCounterparty dtc  = new OtcDerivativeCounterparty();
        dtc.setAmlMonitorFlag("true");
        dtc.setCorporateName(corporateName);
        dtc.setCustomerManager(userId);
        dtc.setIntroductionDepartment(deptCode);
        otcDerivativeCounterpartyMapper.updateByCorporatename(dtc);

        List<OtcDerivativeCounterparty> all = otcDerivativeCounterpartyMapper.selectAll(corporateName);
        String socialCode = all.get(0).getUnifiedsocialCode();



         String  url = "http://10.2.145.216:9090/certificates/expired/NATURE_PERSON";
         Map<String,String> params = new HashMap<>();
         params.put("checkDate",checkDay);
         params.put("unifiedsocialCodeList",socialCode);
         log.info("请求地址:{}\n请求参数:{}",url,params.toString());


         List<AmlBeneficiary> idNoList = new ArrayList<>();
         idNoList = amlBeneficiaryMapper.selectByclientName(corporateName);
         List<String> idnoList = idNoList.stream().filter(idNo -> "1".equals(idNo.getCategory()))
                                                  .filter(idNo -> "回访9527".equals(idNo.getName()))
                                                  .map(AmlBeneficiary::getIdNo).collect(Collectors.toList());

         List<String> recoridList = new ArrayList<>();
         for(String idno : idnoList){
             List<CrtExpiredPersonRecord> record = new ArrayList<>();
             record = crtExpiredPersonRecordMapper.selectByIdNo(idno);
             if(record.isEmpty()){
                 continue;
             }
             List<String> recordId = record.stream().map(CrtExpiredPersonRecord::getCrtExpiredRecordId).collect(Collectors.toList());
             recoridList.add(record.get(0).getCrtExpiredRecordId());
         }

         recoridList.forEach(recordId ->{
             crtExpiredRecordMapper.deleteByPrimaryKey(recordId);
         });

         crtExpiredRecordMapper.deleteByunisocialcode(socialCode);



        String responese = HttpUtils.postMap(url,params);
        log.info(responese);


        CrtExpiredRecord updatePorcessing = new CrtExpiredRecord();
        updatePorcessing.setUnifiedsocialCode(socialCode);
        List<CrtExpiredRecord> titleList = crtExpiredRecordMapper.selectProcessingflow(updatePorcessing);
        List<String> title = titleList.stream().map(CrtExpiredRecord::getTitle).collect(Collectors.toList());
        log.info(title.toString());
        return title;











    }

}
