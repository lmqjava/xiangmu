package com.wuliu.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuliu.mapper.PeisongMapper;
import com.wuliu.pojo.Peisong;
import com.wuliu.service.IPeisong;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeisongImpl implements IPeisong {
    @Autowired
    private PeisongMapper peisongMapper;
    @Override
    public LayUiUtils selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Peisong> list=peisongMapper.selectAll();
        PageInfo<Peisong> pageInfo=new PageInfo<>(list);
        LayUiUtils utils=new LayUiUtils();
        utils.setCode(0);
        utils.setMsg("");
        utils.setCount(pageInfo.getTotal());
        utils.setData(pageInfo.getList());
        return utils;
    }
}
