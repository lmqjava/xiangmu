package com.wuliu.mapper;

import com.wuliu.pojo.Dingdanzt;
import com.wuliu.pojo.DingdanztExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DingdanztMapper {
    int countByExample(DingdanztExample example);

    int deleteByExample(DingdanztExample example);

    int deleteByPrimaryKey(Integer orderstatus);

    int insert(Dingdanzt record);

    int insertSelective(Dingdanzt record);

    List<Dingdanzt> selectByExample(DingdanztExample example);

    Dingdanzt selectByPrimaryKey(Integer orderstatus);

    int updateByExampleSelective(@Param("record") Dingdanzt record, @Param("example") DingdanztExample example);

    int updateByExample(@Param("record") Dingdanzt record, @Param("example") DingdanztExample example);

    int updateByPrimaryKeySelective(Dingdanzt record);

    int updateByPrimaryKey(Dingdanzt record);
}