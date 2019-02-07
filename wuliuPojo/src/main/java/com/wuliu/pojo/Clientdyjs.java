package com.wuliu.pojo;

import java.io.Serializable;

public class Clientdyjs implements Serializable {
    private Integer partnumber;

    private Integer clientid;

    private static final long serialVersionUID = 1L;

    public Integer getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(Integer partnumber) {
        this.partnumber = partnumber;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }
}