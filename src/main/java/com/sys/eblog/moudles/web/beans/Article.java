package com.sys.eblog.moudles.web.beans;

import com.sys.eblog.base.beans.BaseBean;

public class Article extends BaseBean {
    private Integer aid;
    private String title ;
    private String content ;
    private Integer zans ;
    private Integer comments ;
    private Integer reads ;
    private String userid;
    private String labels ;
    private String eclass ;
    private String simg;
private String scontent ;

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent;
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getZans() {
        return zans;
    }

    public void setZans(Integer zans) {
        this.zans = zans;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getReads() {
        return reads;
    }

    public void setReads(Integer reads) {
        this.reads = reads;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getEclass() {
        return eclass;
    }

    public void setEclass(String eclass) {
        this.eclass = eclass;
    }
}
