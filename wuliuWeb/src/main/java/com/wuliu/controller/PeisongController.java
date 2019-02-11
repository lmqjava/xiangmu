package com.wuliu.controller;

import com.wuliu.service.IPeisong;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Peisong")
@RestController
public class PeisongController {

    @Autowired
    private IPeisong iPeisong;

    @RequestMapping("/selectALL")
    public LayUiUtils selectAll(@RequestParam(name="page", defaultValue="1") int pageNum, @RequestParam(name="limit", defaultValue="10") int pageSize){
        LayUiUtils utils=iPeisong.selectAll(pageNum,pageSize);
        return  utils;
    }
}
