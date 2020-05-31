package com.sys.eblog.test;
import com.sys.eblog.base.contextholer.SpringContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestC {
    //@Autowired
    private TestDao testDao = SpringContextHolder.getBean(TestDao.class);
    //@Autowired
    //private TestDao testDao;

    @GetMapping("/test")
    @ResponseBody
    public List getInfO(){
        return testDao.getInfo();
    }

    @GetMapping("/hello")
    public String hello(){
        return "html/hello";
    }

    @GetMapping("/login")
    public String login(){
        return "html/login";
    }
}
