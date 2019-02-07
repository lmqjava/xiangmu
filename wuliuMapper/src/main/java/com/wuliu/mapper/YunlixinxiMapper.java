package com.wuliu.mapper;

import com.wuliu.pojo.Yunlixinxi;
import com.wuliu.pojo.YunlixinxiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunlixinxiMapper {
    int countByExample(YunlixinxiExample example);

    int deleteByExample(YunlixinxiExample example);

    int deleteByPrimaryKey(Integer ylxxid);

    int insert(Yunlixinxi record);

    int insertSelective(Yunlixinxi record);

    List<Yunlixinxi> selectByExample(YunlixinxiExample example);

    Yunlixinxi selectByPrimaryKey(Integer ylxxid);

    int updateByExampleSelective(@Param("record") Yunlixinxi record, @Param("example") YunlixinxiExample example);

    int updateByExample(@Param("record") Yunlixinxi record, @Param("example") YunlixinxiExample example);

    int updateByPrimaryKeySelective(Yunlixinxi record);

    int updateByPrimaryKey(Yunlixinxi record);
}