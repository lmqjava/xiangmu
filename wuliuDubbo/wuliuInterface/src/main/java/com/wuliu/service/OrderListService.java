package com.wuliu.service;

import com.wuliu.pojo.Orderlist2;
import com.wuliu.utils.LayUiUtils;

import java.util.List;

public interface OrderListService {
    LayUiUtils selectAllOrder(int pageNum, int pageSize);

    List<Orderlist2> getTwo();
}
