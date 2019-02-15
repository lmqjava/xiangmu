package com.wuliu.controller;

import com.wuliu.pojo.Peisongdian;
import com.wuliu.service.IPeisongdian;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Peisongdian")
@RestController
public class PeisongdianController{

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

    @RequestMapping("/insertPeisongdian")
    public void insertP(@RequestParam(name ="peisongidianname" )String peisongidianname,
                        @RequestParam(name ="shengfen" )String shengfen,
                        @RequestParam(name ="psphone" )String psphone,
                        @RequestParam(name ="psemail" )String psemail,
                        @RequestParam(name ="psxinxi" )String psxinxi){
        Peisongdian peisongdian=new Peisongdian(peisongidianname,shengfen,psphone,psemail,psxinxi);
        iPeisongdian.insertPeisongdian(peisongdian);
    }
    @RequestMapping("/updatePeisongdian")
    public String updateP(@RequestParam(name = "psdid")Integer psdid,
                          @RequestParam(name ="peisongidianname" )String peisongidianname,
                          @RequestParam(name ="shengfen" )String shengfen,
                          @RequestParam(name ="psphone" )String psphone,
                          @RequestParam(name ="psemail" )String psemail,
                          @RequestParam(name ="psxinxi" )String psxinxi) {
        System.out.print("进入");
        Peisongdian peisongdian=new Peisongdian(psdid,peisongidianname,shengfen,psphone,psemail,psxinxi);
        System.out.print(peisongdian);
        iPeisongdian.updatePeisongdian(peisongdian);
        return "redirect:/Peisongdian/selectAll";
    }
}
