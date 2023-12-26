package com.example.demo.test.certificates.service;

import java.util.List;

public interface Certificateservice {

    List<String> createFlow(String corporateName , String customer) throws Exception;
}
