package com.wuliu.pojo;

import java.io.Serializable;

public class Rolerplay implements Serializable {
    private Integer czqxid;

    private Integer partnumber;

    private static final long serialVersionUID = 1L;

    public Integer getCzqxid() {
        return czqxid;
    }

    public void setCzqxid(Integer czqxid) {
        this.czqxid = czqxid;
    }

    public Integer getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(Integer partnumber) {
        this.partnumber = partnumber;
    }
}