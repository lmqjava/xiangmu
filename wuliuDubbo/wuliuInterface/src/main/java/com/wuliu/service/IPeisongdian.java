package com.wuliu.service;

import com.wuliu.pojo.Peisongdian;
import com.wuliu.utils.LayUiUtils;

import java.util.List;

public interface IPeisongdian {

    /*
   查询配送点信息
    */
    LayUiUtils selectAll(int pageNum,int pageSize);
    /*
    删除
     */
    int deletePeisongdian(Integer psdid);
    /*
    添加
     */
    int insertPeisongdian(Peisongdian peisongdian);
    /*
    修改
     */
    int updatePeisongdian(Peisongdian peisongdian);
}
