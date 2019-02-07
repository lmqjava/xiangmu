package com.wuliu.mapper;

import com.wuliu.pojo.Rolerplay;
import com.wuliu.pojo.RolerplayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolerplayMapper {
    int countByExample(RolerplayExample example);

    int deleteByExample(RolerplayExample example);

    int insert(Rolerplay record);

    int insertSelective(Rolerplay record);

    List<Rolerplay> selectByExample(RolerplayExample example);

    int updateByExampleSelective(@Param("record") Rolerplay record, @Param("example") RolerplayExample example);

    int updateByExample(@Param("record") Rolerplay record, @Param("example") RolerplayExample example);
}