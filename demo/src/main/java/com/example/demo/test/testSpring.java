package com.example.demo.test;

import model.OtcDerivativeCounterparty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sql.OtcDerivativeCounterpartyMapper;

import java.util.ArrayList;
import java.util.List;

//@Component
//public class testSpring {
//
//    @Autowired
//    private OtcDerivativeCounterpartyMapper otcDerivativeCounterpartyMapper;
//
//
//    static Logger log = LoggerFactory.getLogger(testSpring.class);
//
//    public List<OtcDerivativeCounterparty> selectAll() {
//        try {
//            OtcDerivativeCounterparty otcDerivativeCounterparty = new OtcDerivativeCounterparty();
//            otcDerivativeCounterparty.setCorporateName("测试产品关注类");
//            otcDerivativeCounterparty.setAmlMonitorFlag("true");
//            List<OtcDerivativeCounterparty> result = new ArrayList<>();
//            result = otcDerivativeCounterpartyMapper.selectAll(otcDerivativeCounterparty);
//            log.info(result.get(0).getClientId(), result.get(0).getAbbreviation());
//            List<String> clientIdList = new ArrayList<>();
//            result.forEach(item -> clientIdList.add(item.getClientId()));
//            List<OtcDerivativeCounterparty> allInfo = new ArrayList<>();
//            clientIdList.stream().forEach(clientid -> {
//                allInfo.addAll(otcDerivativeCounterpartyMapper.selectClientbyid(clientid));
//            });
//
//            log.info(allInfo.toString());
//            return allInfo;
//        }catch (Exception e ){
//            log.info("抛出的错误是{}",e);
//            return null;
//        }
//    }
//}
