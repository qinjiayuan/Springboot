package test;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import test.service.impl.Testservice;

import javax.annotation.Resource;


@RestController
@RequestMapping("/api/test")
public class TestController {



    @Resource
    private Testservice testservice;

    @GetMapping("/hello")
    public void hello(){

        testservice.hello();

    }
}
