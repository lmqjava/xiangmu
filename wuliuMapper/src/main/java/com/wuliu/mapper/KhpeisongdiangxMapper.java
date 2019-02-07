package com.wuliu.mapper;

import com.wuliu.pojo.Khpeisongdiangx;
import com.wuliu.pojo.KhpeisongdiangxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KhpeisongdiangxMapper {
    int countByExample(KhpeisongdiangxExample example);

    int deleteByExample(KhpeisongdiangxExample example);

    int insert(Khpeisongdiangx record);

    int insertSelective(Khpeisongdiangx record);

    List<Khpeisongdiangx> selectByExample(KhpeisongdiangxExample example);

    int updateByExampleSelective(@Param("record") Khpeisongdiangx record, @Param("example") KhpeisongdiangxExample example);

    int updateByExample(@Param("record") Khpeisongdiangx record, @Param("example") KhpeisongdiangxExample example);
}