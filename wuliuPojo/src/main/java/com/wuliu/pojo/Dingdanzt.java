package com.wuliu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Dingdanzt implements Serializable {
    private Integer orderstatus;

    private Integer personnellid;

    private Integer orderlistid;

    private String orderneirong;

    private String orderremark;

    private Date orderstatuschagetime;

    private static final long serialVersionUID = 1L;

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Integer getPersonnellid() {
        return personnellid;
    }

    public void setPersonnellid(Integer personnellid) {
        this.personnellid = personnellid;
    }

    public Integer getOrderlistid() {
        return orderlistid;
    }

    public void setOrderlistid(Integer orderlistid) {
        this.orderlistid = orderlistid;
    }

    public String getOrderneirong() {
        return orderneirong;
    }

    public void setOrderneirong(String orderneirong) {
        this.orderneirong = orderneirong == null ? null : orderneirong.trim();
    }

    public String getOrderremark() {
        return orderremark;
    }

    public void setOrderremark(String orderremark) {
        this.orderremark = orderremark == null ? null : orderremark.trim();
    }

    public Date getOrderstatuschagetime() {
        return orderstatuschagetime;
    }

    public void setOrderstatuschagetime(Date orderstatuschagetime) {
        this.orderstatuschagetime = orderstatuschagetime;
    }
}