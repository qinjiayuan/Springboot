package com.example.demo.test.clientreview.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Clientreviewservice    {

    List<String> createFlow(String corporateName , String customermanager , String isnew) throws Exception;
}
