package com.wuliu.mapper;

import com.wuliu.pojo.Addprice;
import com.wuliu.pojo.AddpriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddpriceMapper {
    int countByExample(AddpriceExample example);

    int deleteByExample(AddpriceExample example);

    int insert(Addprice record);

    int insertSelective(Addprice record);

    List<Addprice> selectByExample(AddpriceExample example);

    int updateByExampleSelective(@Param("record") Addprice record, @Param("example") AddpriceExample example);

    int updateByExample(@Param("record") Addprice record, @Param("example") AddpriceExample example);
}