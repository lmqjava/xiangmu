package com.wuliu.pojo;

import java.io.Serializable;

public class Khpeisongdiangx implements Serializable {
    private Integer clientid;

    private Integer psdid;

    private static final long serialVersionUID = 1L;

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getPsdid() {
        return psdid;
    }

    public void setPsdid(Integer psdid) {
        this.psdid = psdid;
    }
}