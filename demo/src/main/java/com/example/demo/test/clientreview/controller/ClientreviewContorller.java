package com.example.demo.test.clientreview.controller;

import com.example.demo.test.clientreview.service.Clientreviewservice;
import com.example.demo.test.http.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ServiceResponse<List<String>> select() throws Exception {
        List<String> clientId = new ArrayList<>();
        clientId = clientreviewservice.select();
        return ServiceResponse.success(clientId);
    }
}
