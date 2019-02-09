package com.wuliu.controller;

import com.wuliu.service.IPeisongdian;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Peisongdian")
@RestController
public class PeisongdianController {

    @Autowired
    private IPeisongdian iPeisongdian;

    @RequestMapping("/selectAll")
    public LayUiUtils selectAll(@RequestParam(name="page", defaultValue="1") int pageNum, @RequestParam(name="limit", defaultValue="10") int pageSize){
        LayUiUtils utils=iPeisongdian.selectAll(pageNum,pageSize);
        return utils;
    }
    @RequestMapping("/deletePeisongdian")
    public void delectP(@RequestParam(name = "psdid")Integer psdid){
        iPeisongdian.deletePeisongdian(psdid);
    }
}
