package com.wuliu.pojo;

import java.io.Serializable;

public class Caozuoquanxian implements Serializable {
    private Integer czqxid;

    private String czname;

    private static final long serialVersionUID = 1L;

    public Integer getCzqxid() {
        return czqxid;
    }

    public void setCzqxid(Integer czqxid) {
        this.czqxid = czqxid;
    }

    public String getCzname() {
        return czname;
    }

    public void setCzname(String czname) {
        this.czname = czname == null ? null : czname.trim();
    }
}