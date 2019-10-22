package com.sys.eblog.moudles.web.dao;

import com.sys.eblog.moudles.web.beans.ArtComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArtCommentDao {
    //获取评论
    List<ArtComment> getArtComments(@Param("aid") String aid) ;
    //删除评论
    int artCommentsDel(ArtComment artComment);

    //增加评论
    int artCommentAdd(ArtComment artComment);
}
