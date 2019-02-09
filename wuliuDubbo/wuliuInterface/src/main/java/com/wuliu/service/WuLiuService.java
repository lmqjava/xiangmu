package com.wuliu.service;

import com.wuliu.pojo.Car;
import com.wuliu.utils.LayUiUtils;

import java.util.List;

public interface WuLiuService {
    LayUiUtils selectAllCar(int pageNum,int pageSize);
    List<Car> selectAllCars();
}
