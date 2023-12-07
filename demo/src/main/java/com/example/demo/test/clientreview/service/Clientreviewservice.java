package com.example.demo.test.clientreview.service;

import org.springframework.stereotype.Service;

@Service
public interface Clientreviewservice    {

    void createFlow(String corporateName , String customermanager , String isnew) throws Exception;
}
