package com.wuliu.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuliu.mapper.PeisongdianMapper;
import com.wuliu.pojo.Peisongdian;
import com.wuliu.service.IPeisongdian;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeisongdianImpl implements IPeisongdian {

    @Autowired
    private PeisongdianMapper peisongdianMapper;

    @Override
    public LayUiUtils selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Peisongdian> list=peisongdianMapper.selectAll();
        PageInfo<Peisongdian> pageInfo=new PageInfo<>(list);
        LayUiUtils utils=new LayUiUtils();
        utils.setCode(0);
        utils.setCount(pageInfo.getTotal());
        utils.setMsg("");
        utils.setData(pageInfo.getList());
        return utils;
    }

    @Override
    public int deletePeisongdian(Integer psdid) {
        return peisongdianMapper.deletePeisongdian(psdid);
    }

    @Override
    public int insertPeisongdian(Peisongdian peisongdian) {
        return peisongdianMapper.insertPeisongdian(peisongdian);
    }

    @Override
    public int updatePeisongdian(Peisongdian peisongdian) {
        return peisongdianMapper.updatePeisongdian(peisongdian);
    }
}
