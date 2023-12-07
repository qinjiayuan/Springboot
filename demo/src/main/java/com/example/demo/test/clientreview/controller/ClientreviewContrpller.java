package com.example.demo.test.clientreview.controller;

import com.example.demo.test.clientreview.service.Clientreviewservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientreview")
public class ClientreviewContrpller {

    @Autowired
    private Clientreviewservice clientreviewservice;

     @PostMapping("/processjob")
    public void startjob(){

     }
}
