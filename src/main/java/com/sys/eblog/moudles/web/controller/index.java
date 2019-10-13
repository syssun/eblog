package com.sys.eblog.moudles.web.controller;

import com.sys.eblog.test.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
public class index {
    @Autowired
    private TestDao testDao;
    //首页
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("list",testDao.getInfo());
        return "index";
    }

    //明细
    @RequestMapping("/detail/{aid}")
    public String detail(@PathVariable("aid") String aid){
        System.out.println(aid);
        return "html/detail";
    }
}
