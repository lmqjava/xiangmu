package com.wuliu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Good implements Serializable {
    private Integer goodid;

    private Integer deliveryreceiptid;

    private Integer orderlistid;

    private String goodname;

    private Integer goodnum;

    private BigDecimal goodprice;

    private Float goodtiji;

    private Float goodzhongliang;

    private String goodmiaoshu;

    private static final long serialVersionUID = 1L;

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getDeliveryreceiptid() {
        return deliveryreceiptid;
    }

    public void setDeliveryreceiptid(Integer deliveryreceiptid) {
        this.deliveryreceiptid = deliveryreceiptid;
    }

    public Integer getOrderlistid() {
        return orderlistid;
    }

    public void setOrderlistid(Integer orderlistid) {
        this.orderlistid = orderlistid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Integer getGoodnum() {
        return goodnum;
    }

    public void setGoodnum(Integer goodnum) {
        this.goodnum = goodnum;
    }

    public BigDecimal getGoodprice() {
        return goodprice;
    }

    public void setGoodprice(BigDecimal goodprice) {
        this.goodprice = goodprice;
    }

    public Float getGoodtiji() {
        return goodtiji;
    }

    public void setGoodtiji(Float goodtiji) {
        this.goodtiji = goodtiji;
    }

    public Float getGoodzhongliang() {
        return goodzhongliang;
    }

    public void setGoodzhongliang(Float goodzhongliang) {
        this.goodzhongliang = goodzhongliang;
    }

    public String getGoodmiaoshu() {
        return goodmiaoshu;
    }

    public void setGoodmiaoshu(String goodmiaoshu) {
        this.goodmiaoshu = goodmiaoshu == null ? null : goodmiaoshu.trim();
    }
}