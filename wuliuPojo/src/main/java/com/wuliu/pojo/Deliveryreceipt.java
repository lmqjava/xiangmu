package com.wuliu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Deliveryreceipt implements Serializable {
    private Integer deliveryreceiptid;

    private Integer ylxxid;

    private Date deliveryreceiptdate;

    private static final long serialVersionUID = 1L;

    public Integer getDeliveryreceiptid() {
        return deliveryreceiptid;
    }

    public void setDeliveryreceiptid(Integer deliveryreceiptid) {
        this.deliveryreceiptid = deliveryreceiptid;
    }

    public Integer getYlxxid() {
        return ylxxid;
    }

    public void setYlxxid(Integer ylxxid) {
        this.ylxxid = ylxxid;
    }

    public Date getDeliveryreceiptdate() {
        return deliveryreceiptdate;
    }

    public void setDeliveryreceiptdate(Date deliveryreceiptdate) {
        this.deliveryreceiptdate = deliveryreceiptdate;
    }
}