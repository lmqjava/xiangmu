package com.wuliu.mapper;

import com.wuliu.pojo.Orderlist;
import com.wuliu.pojo.OrderlistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderlistMapper {
    List<Orderlist> selectAllOrder();

    int countByExample(OrderlistExample example);

    int deleteByExample(OrderlistExample example);

    int deleteByPrimaryKey(Integer orderlistid);

    int insert(Orderlist record);

    int insertSelective(Orderlist record);

    List<Orderlist> selectByExample(OrderlistExample example);

    Orderlist selectByPrimaryKey(Integer orderlistid);

    int updateByExampleSelective(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByExample(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByPrimaryKeySelective(Orderlist record);

    int updateByPrimaryKey(Orderlist record);
}