package com.wuliu.mapper;

import com.wuliu.pojo.Peisongfanwei;
import com.wuliu.pojo.PeisongfanweiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeisongfanweiMapper {
    int countByExample(PeisongfanweiExample example);

    int deleteByExample(PeisongfanweiExample example);

    int deleteByPrimaryKey(Integer psfwid);

    int insert(Peisongfanwei record);

    int insertSelective(Peisongfanwei record);

    List<Peisongfanwei> selectByExample(PeisongfanweiExample example);

    Peisongfanwei selectByPrimaryKey(Integer psfwid);

    int updateByExampleSelective(@Param("record") Peisongfanwei record, @Param("example") PeisongfanweiExample example);

    int updateByExample(@Param("record") Peisongfanwei record, @Param("example") PeisongfanweiExample example);

    int updateByPrimaryKeySelective(Peisongfanwei record);

    int updateByPrimaryKey(Peisongfanwei record);
}