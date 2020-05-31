package com.sys.eblog.test;
import com.sys.eblog.base.annotation.MyBatisDao;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;
@MyBatisDao
public interface TestDao {
    List<Map<String,Object>> getInfo();
}
