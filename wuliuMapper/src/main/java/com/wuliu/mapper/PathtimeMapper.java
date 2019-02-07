package com.wuliu.mapper;

import com.wuliu.pojo.Pathtime;
import com.wuliu.pojo.PathtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PathtimeMapper {
    int countByExample(PathtimeExample example);

    int deleteByExample(PathtimeExample example);

    int deleteByPrimaryKey(Integer pathtimeid);

    int insert(Pathtime record);

    int insertSelective(Pathtime record);

    List<Pathtime> selectByExample(PathtimeExample example);

    Pathtime selectByPrimaryKey(Integer pathtimeid);

    int updateByExampleSelective(@Param("record") Pathtime record, @Param("example") PathtimeExample example);

    int updateByExample(@Param("record") Pathtime record, @Param("example") PathtimeExample example);

    int updateByPrimaryKeySelective(Pathtime record);

    int updateByPrimaryKey(Pathtime record);
}