package com.sys.eblog.moudles.web.beans;

import com.sys.eblog.base.beans.BaseBean;

public class HotArt extends BaseBean {
    private Integer id;
    private Integer aid ;
    private  String pid ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
