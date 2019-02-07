package com.wuliu.mapper;

import com.wuliu.pojo.Personnel;
import com.wuliu.pojo.PersonnelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonnelMapper {
    int countByExample(PersonnelExample example);

    int deleteByExample(PersonnelExample example);

    int deleteByPrimaryKey(Integer personnelid);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    List<Personnel> selectByExample(PersonnelExample example);

    Personnel selectByPrimaryKey(Integer personnelid);

    int updateByExampleSelective(@Param("record") Personnel record, @Param("example") PersonnelExample example);

    int updateByExample(@Param("record") Personnel record, @Param("example") PersonnelExample example);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);
}