package com.wuliu.mapper;

import com.wuliu.pojo.Roler;
import com.wuliu.pojo.RolerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolerMapper {
    int countByExample(RolerExample example);

    int deleteByExample(RolerExample example);

    int deleteByPrimaryKey(Integer partnumber);

    int insert(Roler record);

    int insertSelective(Roler record);

    List<Roler> selectByExample(RolerExample example);

    Roler selectByPrimaryKey(Integer partnumber);

    int updateByExampleSelective(@Param("record") Roler record, @Param("example") RolerExample example);

    int updateByExample(@Param("record") Roler record, @Param("example") RolerExample example);

    int updateByPrimaryKeySelective(Roler record);

    int updateByPrimaryKey(Roler record);
}