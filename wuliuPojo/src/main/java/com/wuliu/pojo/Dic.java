package com.wuliu.pojo;

import java.io.Serializable;

public class Dic implements Serializable {
    private Integer dnumber;

    private String dname;

    private String dcontent;

    private static final long serialVersionUID = 1L;

    public Integer getDnumber() {
        return dnumber;
    }

    public void setDnumber(Integer dnumber) {
        this.dnumber = dnumber;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDcontent() {
        return dcontent;
    }

    public void setDcontent(String dcontent) {
        this.dcontent = dcontent == null ? null : dcontent.trim();
    }
}