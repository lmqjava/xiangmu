package com.wuliu.mapper;

import com.wuliu.pojo.Caozuoquanxian;
import com.wuliu.pojo.CaozuoquanxianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaozuoquanxianMapper {
    int countByExample(CaozuoquanxianExample example);

    int deleteByExample(CaozuoquanxianExample example);

    int deleteByPrimaryKey(Integer czqxid);

    int insert(Caozuoquanxian record);

    int insertSelective(Caozuoquanxian record);

    List<Caozuoquanxian> selectByExample(CaozuoquanxianExample example);

    Caozuoquanxian selectByPrimaryKey(Integer czqxid);

    int updateByExampleSelective(@Param("record") Caozuoquanxian record, @Param("example") CaozuoquanxianExample example);

    int updateByExample(@Param("record") Caozuoquanxian record, @Param("example") CaozuoquanxianExample example);

    int updateByPrimaryKeySelective(Caozuoquanxian record);

    int updateByPrimaryKey(Caozuoquanxian record);
}