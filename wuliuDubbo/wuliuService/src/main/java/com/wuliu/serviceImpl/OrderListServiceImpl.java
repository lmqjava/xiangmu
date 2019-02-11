package com.wuliu.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuliu.mapper.OrderlistMapper;
import com.wuliu.pojo.Orderlist;
import com.wuliu.service.OrderListService;
import com.wuliu.utils.LayUiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderListServiceImpl implements OrderListService {
    @Autowired
    private OrderlistMapper orderlistMapper;

    @Override
    public LayUiUtils selectAllOrder(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);



        List<Orderlist> list=orderlistMapper.selectAllOrder();

        PageInfo<Orderlist> infos=new PageInfo<>(list);

        LayUiUtils lau=new LayUiUtils();

        lau.setCount(infos.getTotal());
        lau.setData(infos.getList());
        lau.setCode(0);
        lau.setMsg("");
        return lau;

    }
}
