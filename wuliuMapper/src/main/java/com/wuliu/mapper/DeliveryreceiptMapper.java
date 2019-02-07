package com.wuliu.mapper;

import com.wuliu.pojo.Deliveryreceipt;
import com.wuliu.pojo.DeliveryreceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryreceiptMapper {
    int countByExample(DeliveryreceiptExample example);

    int deleteByExample(DeliveryreceiptExample example);

    int deleteByPrimaryKey(Integer deliveryreceiptid);

    int insert(Deliveryreceipt record);

    int insertSelective(Deliveryreceipt record);

    List<Deliveryreceipt> selectByExample(DeliveryreceiptExample example);

    Deliveryreceipt selectByPrimaryKey(Integer deliveryreceiptid);

    int updateByExampleSelective(@Param("record") Deliveryreceipt record, @Param("example") DeliveryreceiptExample example);

    int updateByExample(@Param("record") Deliveryreceipt record, @Param("example") DeliveryreceiptExample example);

    int updateByPrimaryKeySelective(Deliveryreceipt record);

    int updateByPrimaryKey(Deliveryreceipt record);
}