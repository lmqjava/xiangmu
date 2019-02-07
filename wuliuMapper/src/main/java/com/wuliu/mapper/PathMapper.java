package com.wuliu.mapper;

import com.wuliu.pojo.Path;
import com.wuliu.pojo.PathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PathMapper {
    int countByExample(PathExample example);

    int deleteByExample(PathExample example);

    int deleteByPrimaryKey(Integer pathid);

    int insert(Path record);

    int insertSelective(Path record);

    List<Path> selectByExample(PathExample example);

    Path selectByPrimaryKey(Integer pathid);

    int updateByExampleSelective(@Param("record") Path record, @Param("example") PathExample example);

    int updateByExample(@Param("record") Path record, @Param("example") PathExample example);

    int updateByPrimaryKeySelective(Path record);

    int updateByPrimaryKey(Path record);
}