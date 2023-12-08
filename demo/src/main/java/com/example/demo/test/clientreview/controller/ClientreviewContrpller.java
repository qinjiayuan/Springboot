package com.example.demo.test.clientreview.controller;

import com.example.demo.test.clientreview.service.Clientreviewservice;
import com.example.demo.test.http.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientreview")
public class ClientreviewContrpller {

    @Autowired
    private Clientreviewservice clientreviewservice;


     @PostMapping("/processjob")
    public ServiceResponse<List<String>> startjob(@RequestParam Map<String,String> params) throws Exception {
         String corporateName = params.get("corporateName");
         String customermanager = params.get("customermanager");
         String isnew = params.get("isnew");
         List<String> title = clientreviewservice.createFlow(corporateName,customermanager,isnew);
         return ServiceResponse.success(title);

     }}
