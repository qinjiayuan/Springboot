package com.example.demo.test.clientreview.service;

import model.Auser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Clientreviewservice    {

    List<String> createFlow(String corporateName , String customermanager , String isnew) throws Exception;

    List<Auser> checkCustomer ( String customermanager) throws Exception;

    Boolean checkCorporation(String corporateName) ;

    String getid();

    String getIdNo();

    List<String> select() throws Exception;
}
