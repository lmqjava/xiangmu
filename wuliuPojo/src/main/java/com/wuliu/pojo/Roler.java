package com.wuliu.pojo;

import java.io.Serializable;

public class Roler implements Serializable {
    private Integer partnumber;

    private String rolername;

    private static final long serialVersionUID = 1L;

    public Integer getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(Integer partnumber) {
        this.partnumber = partnumber;
    }

    public String getRolername() {
        return rolername;
    }

    public void setRolername(String rolername) {
        this.rolername = rolername == null ? null : rolername.trim();
    }
}