package com.sys.eblog.base.beans;

import java.io.Serializable;
import java.util.Date;

public class BaseBean implements Serializable {
    private Date adddate ;
    private Integer delflg;
    private Date upddate;

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Integer getDelflg() {
        return delflg;
    }

    public void setDelflg(Integer delflg) {
        this.delflg = delflg;
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }
}
