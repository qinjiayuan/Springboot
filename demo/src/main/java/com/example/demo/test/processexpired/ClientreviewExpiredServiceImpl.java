package com.example.demo.test.processexpired;

import com.example.demo.test.clientreview.service.Clientreviewservice;
import model.ClientReviewBuffer;
import model.OtcDerivativeCounterparty;
import org.springframework.beans.factory.annotation.Autowired;
import sql.ClientReviewBufferMapper;
import sql.OtcDerivativeCounterpartyMapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class ClientreviewExpiredServiceImpl {

    @Autowired
    private Clientreviewservice clientreviewservice;

    @Resource
    private ClientReviewBufferMapper clientReviewBufferMapper;

    @Resource
    private OtcDerivativeCounterpartyMapper otcDerivativeCounterpartyMapper;

//    public String clientreviewexpired(String corporateName , String user) throws Exception{
//        try{
//            clientreviewservice.createFlow(corporateName,user,"1");
//            List<OtcDerivativeCounterparty> clientIdList = new ArrayList<>();
//            clientIdList = otcDerivativeCounterpartyMapper.selectAll(corporateName);
//            clientIdList.stream().filter(client ->"true".equals()).forEach(dataList ->{
//
//            });
//
//
//        }
//        catch (Exception e ){
//            throw new Exception(e.toString());
//        }
//    }


}
