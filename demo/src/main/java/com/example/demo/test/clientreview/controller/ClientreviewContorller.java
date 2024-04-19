package com.example.demo.test.clientreview.controller;

import com.example.demo.test.clientreview.service.Clientreviewservice;
import com.example.demo.test.http.ServiceResponse;
import model.OtcDerivativeCounterparty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientreview")
public class ClientreviewContorller {

    @Autowired
    private Clientreviewservice clientreviewservice;


    @PostMapping("/processjob")
    public ServiceResponse<List<String>> startjob(@RequestParam Map<String, String> params) throws Exception {
        String corporateName = params.get("corporateName");
        String customermanager = params.get("customermanager");
        String isnew = params.get("isnew");
        List<String> title = clientreviewservice.createFlow(corporateName, customermanager, isnew);
        return ServiceResponse.success(title);

    }

    @GetMapping("/getId")
    public ServiceResponse<String> getId() {
        String id = clientreviewservice.getIdNo();
        return ServiceResponse.success(id);
    }

    @GetMapping("/select")
    public ServiceResponse<List<String>> select(@RequestParam String corporateName) throws Exception {
        List<String> clientId = new ArrayList<>();
        clientId = clientreviewservice.select(corporateName);
        return ServiceResponse.success(clientId);
    }

    @GetMapping("/getByclientId")
    public ServiceResponse<List<OtcDerivativeCounterparty>> getClientId(@RequestParam String clientId){
        List<OtcDerivativeCounterparty> info = new ArrayList<>();
        info = clientreviewservice.selectClient(clientId);
        return ServiceResponse.success(info);
    }
    @GetMapping("/getToken")
    public ServiceResponse<String> getToken(@RequestParam String secretKey){
        String token = clientreviewservice.encrypt(secretKey);
        return ServiceResponse.success(token);

    }
}
