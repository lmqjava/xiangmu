package com.wuliu.pojo;

import java.io.Serializable;

public class Path implements Serializable {
    private Integer pathid;

    private String pathname;

    private static final long serialVersionUID = 1L;

    public Integer getPathid() {
        return pathid;
    }

    public void setPathid(Integer pathid) {
        this.pathid = pathid;
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname == null ? null : pathname.trim();
    }
}