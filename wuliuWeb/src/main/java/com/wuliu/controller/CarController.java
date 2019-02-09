package com.wuliu.controller;

import com.wuliu.pojo.Car;
import com.wuliu.service.WuLiuService;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private WuLiuService wuLiuService;
    @GetMapping("/select")
    public LayUiUtils getAllCar(@RequestParam(name = "page", defaultValue = "1") int pageNum,
                                @RequestParam(name = "limit", defaultValue = "10") int pageSize){
        LayUiUtils lau=wuLiuService.selectAllCar(pageNum, pageSize);
        return lau;
    }
    @GetMapping("selectall")
    public List<Car> getAllCars(){
        List<Car> list=wuLiuService.selectAllCars();
        return list;
    }

}
