package com.wuliu.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuliu.pojo.Car;
import com.wuliu.pojo.Orderlist;
import com.wuliu.pojo.Orderlist2;
import com.wuliu.service.OrderListService;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderListService orderListService;
    @GetMapping("/select")
    public LayUiUtils getAllCar(@RequestParam(name = "page", defaultValue = "1") int pageNum,
                                @RequestParam(name = "limit", defaultValue = "10") int pageSize){
        LayUiUtils lau=orderListService.selectAllOrder(pageNum, pageSize);
        return lau;
    }

    @GetMapping("/select2")
    public LayUiUtils getAll2(@RequestParam(name = "page", defaultValue = "1") int pageNum,
                                @RequestParam(name = "limit", defaultValue = "10") int pageSize){
        PageHelper.startPage(pageNum, pageSize);

        List<Orderlist2> list=orderListService.getTwo();

        PageInfo<Orderlist2> infos=new PageInfo<Orderlist2>(list);

        LayUiUtils lau=new LayUiUtils();

        lau.setCount(infos.getTotal());
        lau.setData(infos.getList());
        lau.setCode(0);
        lau.setMsg("");

        return lau;
    }


}
