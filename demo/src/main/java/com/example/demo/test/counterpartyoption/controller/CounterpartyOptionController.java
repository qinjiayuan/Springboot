package com.example.demo.test.counterpartyoption.controller;

import com.example.demo.test.counterpartyoption.service.CounterpartyOpionService;
import com.example.demo.test.counterpartyoption.service.CounterpartyOptionServiceImpl;
import com.example.demo.test.http.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/counterpartyoption")
public class CounterpartyOptionController {

    @Autowired
    private CounterpartyOpionService counterpartyOptionService;

    @RequestMapping("/processjob")
    public ServiceResponse<List<String>> startjob(@RequestParam Map<String,String> params) throws Exception {
        String corporateName = params.get("corporateName");
        String customermanager =  params.get("customermanager");
        List<String> TITLE = counterpartyOptionService.createFlow(corporateName,customermanager);
        return ServiceResponse.success(TITLE);
    };


}
