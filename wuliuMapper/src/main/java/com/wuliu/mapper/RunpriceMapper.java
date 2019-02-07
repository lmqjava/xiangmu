package com.wuliu.mapper;

import com.wuliu.pojo.Runprice;
import com.wuliu.pojo.RunpriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RunpriceMapper {
    int countByExample(RunpriceExample example);

    int deleteByExample(RunpriceExample example);

    int deleteByPrimaryKey(Integer runpriceid);

    int insert(Runprice record);

    int insertSelective(Runprice record);

    List<Runprice> selectByExample(RunpriceExample example);

    Runprice selectByPrimaryKey(Integer runpriceid);

    int updateByExampleSelective(@Param("record") Runprice record, @Param("example") RunpriceExample example);

    int updateByExample(@Param("record") Runprice record, @Param("example") RunpriceExample example);

    int updateByPrimaryKeySelective(Runprice record);

    int updateByPrimaryKey(Runprice record);
}