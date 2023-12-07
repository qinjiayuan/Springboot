package test.service.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestserviceImpl implements Testservice{
    static Logger log = LoggerFactory.getLogger(TestserviceImpl.class);


    @Override
    public void hello(){
        log.info("hello world!");

    }
}
