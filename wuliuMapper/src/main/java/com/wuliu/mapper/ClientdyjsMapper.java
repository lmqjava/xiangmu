package com.wuliu.mapper;

import com.wuliu.pojo.Clientdyjs;
import com.wuliu.pojo.ClientdyjsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientdyjsMapper {
    int countByExample(ClientdyjsExample example);

    int deleteByExample(ClientdyjsExample example);

    int insert(Clientdyjs record);

    int insertSelective(Clientdyjs record);

    List<Clientdyjs> selectByExample(ClientdyjsExample example);

    int updateByExampleSelective(@Param("record") Clientdyjs record, @Param("example") ClientdyjsExample example);

    int updateByExample(@Param("record") Clientdyjs record, @Param("example") ClientdyjsExample example);
}