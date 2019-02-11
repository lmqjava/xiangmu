package com.wuliu.service;

import com.wuliu.utils.LayUiUtils;

public interface OrderListService {
    LayUiUtils selectAllOrder(int pageNum, int pageSize);
}
