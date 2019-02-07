package com.wuliu.mapper;

import com.wuliu.pojo.Peisongdian;
import com.wuliu.pojo.PeisongdianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeisongdianMapper {
    int countByExample(PeisongdianExample example);

    int deleteByExample(PeisongdianExample example);

    int deleteByPrimaryKey(Integer psdid);

    int insert(Peisongdian record);

    int insertSelective(Peisongdian record);

    List<Peisongdian> selectByExample(PeisongdianExample example);

    Peisongdian selectByPrimaryKey(Integer psdid);

    int updateByExampleSelective(@Param("record") Peisongdian record, @Param("example") PeisongdianExample example);

    int updateByExample(@Param("record") Peisongdian record, @Param("example") PeisongdianExample example);

    int updateByPrimaryKeySelective(Peisongdian record);

    int updateByPrimaryKey(Peisongdian record);
}