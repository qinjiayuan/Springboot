package com.example.demo.test.certificates.controller;

import com.example.demo.test.certificates.service.Certificateservice;
import com.example.demo.test.http.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/certificates")
public class CertficatesServiceImpl {

    @Autowired
    private Certificateservice certificateservice;

    @PostMapping("/processjob")
    public ServiceResponse<List<String>> processjob(@RequestParam Map<String,String> params) throws Exception{
        String corporateName = params.get("corporateName");
        String customermanager = params.get("customermanager");
        List<String> title = certificateservice.createFlow(corporateName,customermanager);
        return ServiceResponse.success(title);

    }
}
