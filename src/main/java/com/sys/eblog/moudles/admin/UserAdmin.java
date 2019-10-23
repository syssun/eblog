package com.sys.eblog.moudles.admin;

import com.alibaba.fastjson.JSONArray;
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

    //get_router_data
    @RequestMapping("/get_router_data")
    public Data get_router_data (Euser user){
        Data d = new Data (1,"success");
        String router = "[\n" +
                "\n" +
                "  {\n" +
                "    path: '/users',\n" +
                "    name: 'users',\n" +
                "    component: 'Main',\n" +
                "    meta: {\n" +
                "      icon: 'md-flower',\n" +
                "      title: '用户管理',\n" +
                "      showAlways: true\n" +
                "    },\n" +
                "    children: [\n" +
                "      {\n" +
                "        path: 'userslist',\n" +
                "        name: 'userslist',\n" +
                "        meta: {\n" +
                "          icon: 'md-flower',\n" +
                "          title: '用户列表'\n" +
                "        },\n" +
                "        component: '/myview/goods/goods'\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    path: '/art',\n" +
                "    name: 'art',\n" +
                "    component: 'Main',\n" +
                "    meta: {\n" +
                "      icon: 'md-flower',\n" +
                "      title: '文章管理',\n" +
                "      showAlways: true\n" +
                "    },\n" +
                "    children: [\n" +
                "      {\n" +
                "        path: 'artlist',\n" +
                "        name: 'artlist',\n" +
                "        meta: {\n" +
                "          icon: 'md-flower',\n" +
                "          title: '文章列表'\n" +
                "        },\n" +
                "        component: '/myview/art/artlist'\n" +
                "      },\n" +
                "      {\n" +
                "        path: 'artadd',\n" +
                "        name: 'artadd',\n" +
                "        meta: {\n" +
                "          icon: 'md-flower',\n" +
                "          title: '添加文章'\n" +
                "        },\n" +
                "        component: '/myview/art/artadd'\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]\n";
        d.setData(JSONArray.parse(router));
        return d ;
    }

    //save_error_logger
    @RequestMapping("/save_error_logger")
    public Data save_error_logger (Euser user){
        Data d = new Data (1,"success");
        return d ;
    }

    @RequestMapping("/message/count")
    public Data messageCount (Euser user){
        Data d = new Data (1,"success");
        return d ;
    }
}
