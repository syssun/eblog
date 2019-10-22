package com.sys.eblog.moudles.web.dao;

import com.sys.eblog.moudles.web.beans.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleDao {
    //获取所有文章
    List<Article> getArtList(Article article);

    //通过ID 获取明细
    Article getArtByAid(@Param("aid") String aid);

    //保存
    int artAdd(Article article);
    //修改删除 delflg=1
    int artUpdate(Article article);

    int artUpdateReads(Article article);

}
