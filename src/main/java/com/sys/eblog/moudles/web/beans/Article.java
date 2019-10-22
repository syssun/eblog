package com.sys.eblog.moudles.web.beans;

import com.sys.eblog.base.beans.BaseBean;

import java.util.Date;

public class Article extends BaseBean {
    private Integer aid;
    private String title ;
    private String content ;
    private Integer zans ;
    private Integer comments ;
    private Integer artreads ;
    private String userid;
    private String labels ;
    private String eclass ;
    private String simg;
    private String scontent ;
    private Date adddate ;
    private Date upddate ;

    @Override
    public Date getAdddate() {
        return adddate;
    }

    @Override
    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    @Override
    public Date getUpddate() {
        return upddate;
    }

    @Override
    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

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

    public Integer getArtreads() {
        return artreads;
    }

    public void setArtreads(Integer artreads) {
        this.artreads = artreads;
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
