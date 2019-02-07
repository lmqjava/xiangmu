package com.wuliu.mapper;

import com.wuliu.pojo.Yuangongduiyingjuese;
import com.wuliu.pojo.YuangongduiyingjueseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YuangongduiyingjueseMapper {
    int countByExample(YuangongduiyingjueseExample example);

    int deleteByExample(YuangongduiyingjueseExample example);

    int insert(Yuangongduiyingjuese record);

    int insertSelective(Yuangongduiyingjuese record);

    List<Yuangongduiyingjuese> selectByExample(YuangongduiyingjueseExample example);

    int updateByExampleSelective(@Param("record") Yuangongduiyingjuese record, @Param("example") YuangongduiyingjueseExample example);

    int updateByExample(@Param("record") Yuangongduiyingjuese record, @Param("example") YuangongduiyingjueseExample example);
}