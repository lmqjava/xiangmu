package com.wuliu.mapper;

import com.wuliu.pojo.Car;
import com.wuliu.pojo.CarExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper {

    List<Car> selectAllCar();

    List<Car> selectAllCars();
    int countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(Integer carid);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(Integer carid);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}