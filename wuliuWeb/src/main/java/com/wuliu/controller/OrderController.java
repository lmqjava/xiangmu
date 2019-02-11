package com.wuliu.controller;

import com.wuliu.pojo.Car;
import com.wuliu.service.OrderListService;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



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

}
