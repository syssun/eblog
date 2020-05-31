package com.sys.eblog.moudles.web.dao;

import com.sys.eblog.base.annotation.MyBatisDao;
import com.sys.eblog.moudles.web.beans.HotArt;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MyBatisDao
public interface HotArtDao {
    //获取热门
    List<HotArt> getAllHotArt();
}
