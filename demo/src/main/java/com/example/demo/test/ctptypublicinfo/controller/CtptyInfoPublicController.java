package com.example.demo.test.ctptypublicinfo.controller;


import com.example.demo.test.ctptypublicinfo.service.CtptyInfoPublicService;
import com.example.demo.test.http.ServiceResponse;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ctptypublicinfo")
public class CtptyInfoPublicController {

    @Autowired
    private CtptyInfoPublicService ctptyInfoPublicService;

    @PostMapping("/processjob")
    public ServiceResponse<List<String>> createflow(@RequestParam Map<String,String>params) throws Exception{
        String customerManager = params.get("customermanager");
        List<String> title = new ArrayList<>();
        title = ctptyInfoPublicService.processjob(customerManager);
        return ServiceResponse.success(title);
    }

}
