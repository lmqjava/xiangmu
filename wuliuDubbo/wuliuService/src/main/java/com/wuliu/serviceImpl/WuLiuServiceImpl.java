package com.wuliu.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuliu.mapper.CarMapper;
import com.wuliu.pojo.Car;
import com.wuliu.service.WuLiuService;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WuLiuServiceImpl implements WuLiuService {
    @Autowired
    private CarMapper carMapper;

    @Override
    public LayUiUtils selectAllCar(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);



        List<Car> list=carMapper.selectAllCar();

        PageInfo<Car> infos=new PageInfo<>(list);

        LayUiUtils lau=new LayUiUtils();

        lau.setCount(infos.getTotal());
        lau.setData(infos.getList());
        lau.setCode(0);
        lau.setMsg("");
        return lau;

    }

    @Override
    public List<Car> selectAllCars() {
        return carMapper.selectAllCars();
    }
}

