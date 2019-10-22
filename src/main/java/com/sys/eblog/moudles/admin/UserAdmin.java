package com.sys.eblog.moudles.admin;

import com.sys.eblog.base.beans.Data;
import com.sys.eblog.moudles.web.beans.Euser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class UserAdmin {
    //登录
    //注册
    //退出登录

    @RequestMapping("/login")
    public Data login (Euser user){
        Data d = new Data (1,"success");
        return d ;
    }
    @RequestMapping("/get_info")
    public Data getinfo (Euser user){
        Data d = new Data (1,"success");
        return d ;
    }



}
