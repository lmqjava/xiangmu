package com.wuliu.pojo;

import java.io.Serializable;

public class Yuangongduiyingjuese implements Serializable {
    private Integer partnumber;

    private Integer personnelid;

    private static final long serialVersionUID = 1L;

    public Integer getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(Integer partnumber) {
        this.partnumber = partnumber;
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }
}