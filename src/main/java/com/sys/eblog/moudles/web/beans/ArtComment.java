package com.sys.eblog.moudles.web.beans;

import com.sys.eblog.base.beans.BaseBean;

public class ArtComment extends BaseBean {
    private Integer acid ;
    private Integer aid;
    private String content;
    private Integer userid;

    public Integer getAcid() {
        return acid;
    }

    public void setAcid(Integer acid) {
        this.acid = acid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
