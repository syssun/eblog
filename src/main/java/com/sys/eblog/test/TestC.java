package com.sys.eblog.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestC {
    @Autowired
    private TestDao testDao;


    @GetMapping("/test")
    public List getInfO(){
        return testDao.getInfo();
    }
}
