//package com.example.demo.test.impl;
//import model.OtcDerivativeCounterparty;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
////import com.example.demo.test.testSpring;
////import sql.OtcDerivativeCounterpartyMapper;
//
//import javax.annotation.Resource;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class TestserviceImpl implements Testservice{
//    static Logger log = LoggerFactory.getLogger(TestserviceImpl.class);
//
//
//    @Resource
////    private OtcDerivativeCounterpartyMapper otcDerivativeCounterpartyMapper;
//
//
//
//    @Override
//    public String hello(){
//        log.info("hello world!");
//        return "Hello wordld!";
//
//    }
//
//    @Override
//    public List<OtcDerivativeCounterparty> selectAll(){
//        try{
//            OtcDerivativeCounterparty otcDerivativeCounterparty = new OtcDerivativeCounterparty();
//            otcDerivativeCounterparty.setCorporateName("测试产品关注类");
//            List<OtcDerivativeCounterparty> result = new ArrayList<>();
//            List<String> clientIdList = new ArrayList<>() ;
////            result = otcDerivativeCounterpartyMapper.selectAll("测试产品关注类");
////            result.forEach(item ->clientIdList.add(item.getClientId()));
//            List<OtcDerivativeCounterparty> allinfo = new ArrayList<>();
////            clientIdList.stream().forEach(clientid ->{
////                allinfo.addAll(otcDerivativeCounterpartyMapper.selectClientbyid(clientid));
//            });
//            return allinfo;
//
//        }catch (Exception e){
//            log.info(e.toString());
//            return null;
//        }
//
//
//    }
//}
