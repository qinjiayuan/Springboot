//package com.example.demo.test.controller;
//
//
//
//import model.OtcDerivativeCounterparty;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.demo.test.impl.Testservice;
//
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/api/test")
//
//public class TestController  {
//
//
//
//    @Autowired
//    private Testservice testservice;
//
//
//
//
//
//    @GetMapping("/hello")
//
//    public String hello(){
//
//        testservice.hello();
//        return "Hello world!";
//    }
//
//    @GetMapping("/selectAll")
//    public List<OtcDerivativeCounterparty> selectAll(){
//
//        return testservice.selectAll();
//    }
//
//
//}
