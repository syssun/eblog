package com.sys.eblog.moudles.web.controller;

import com.sys.eblog.base.beans.Data;
import com.sys.eblog.moudles.web.beans.Article;
import com.sys.eblog.moudles.web.dao.ArtCommentDao;
import com.sys.eblog.moudles.web.dao.ArticleDao;
import com.sys.eblog.moudles.web.dao.HotArtDao;
import com.sys.eblog.test.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;

@Controller
@RequestMapping("/web")
public class index {
    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private HotArtDao hotArtDao ;
    @Autowired
    private ArtCommentDao artCommentDao;
    //首页
    @RequestMapping("/index")
    public String index(Model model, Article article){
        model.addAttribute("list",articleDao.getArtList(article));
        return "index";
    }
    //明细
    @RequestMapping("/detail/{aid}")
    public String detail(@PathVariable("aid") String aid,Model model){
        model.addAttribute("data",articleDao.getArtByAid(aid));
        //文章阅读数加一   用消息队列
        return "html/detail";
    }
    //评论
    @RequestMapping("/comments/{aid}")
    @ResponseBody
    public Data comments(@PathVariable("aid") String aid){
        Data data = new Data(1,"success");
        data.setData(artCommentDao.getArtComments(aid));
        return data;
    }

    //热门推荐
    @RequestMapping("/hotlist")
    @ResponseBody
    public Data getHotArt(){
        Data data = new Data(1,"success");
        data.setData(hotArtDao.getAllHotArt());
        return data;
    }

}
