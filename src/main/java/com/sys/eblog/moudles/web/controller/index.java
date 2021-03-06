package com.sys.eblog.moudles.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sys.eblog.base.beans.Data;
import com.sys.eblog.moudles.web.beans.ArtComment;
import com.sys.eblog.moudles.web.beans.Article;
import com.sys.eblog.moudles.web.dao.ArtCommentDao;
import com.sys.eblog.moudles.web.dao.ArticleDao;
import com.sys.eblog.moudles.web.dao.HotArtDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = {"/index","","/"})
    public String index(Model model, Article article){
        if(article.getPageNum()==null){
            article.setPageNum(1);
            article.setPageSize(10);
        }
        PageHelper.startPage(article.getPageNum(),article.getPageSize());
        PageInfo<Article> pageInfo = new PageInfo<>(articleDao.getArtList(article));
        model.addAttribute("list",pageInfo);
        return "index";
    }
    //明细
    @RequestMapping("/detail/{aid}")
    public String detail(@PathVariable("aid") String aid,Model model){
        model.addAttribute("data",articleDao.getArtByAid(aid));
        //文章阅读数加一   用消息队列
        Article article = new Article();
        article.setAid(Integer.parseInt(aid));
        article.setArtreads(1);
        articleDao.artUpdateReads(article);
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
    //点赞
    @RequestMapping("/zans/{aid}")
    @ResponseBody
    public Data zans(@PathVariable("aid") String aid){
        Data data = new Data(1,"success");
        Article article = new Article();
        article.setAid(Integer.parseInt(aid));
        article.setZans(1);
        articleDao.artUpdateReads(article);
        data.setData("");
        return data;
    }
 //发表评论
 //点赞
 @PostMapping("/comment/add")
 @ResponseBody
 public Data zans(@RequestBody ArtComment artComment){
     Data data = new Data(1,"success");
     Article article = new Article();
     article.setAid(artComment.getAid());
     article.setComments(1);
     articleDao.artUpdateReads(article); //+1
     //artComment.setContent(StringEscapeUtils.escapeHtml4(artComment.getContent()));
     artCommentDao.artCommentAdd(artComment);
     //保存评论
     data.setData("");
     return data;
 }


}
