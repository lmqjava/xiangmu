package com.wuliu.pojo;

import java.io.Serializable;

public class Addprice implements Serializable {
    private Integer runpriceid;

    private Integer pathid;

    private static final long serialVersionUID = 1L;

    public Integer getRunpriceid() {
        return runpriceid;
    }

    public void setRunpriceid(Integer runpriceid) {
        this.runpriceid = runpriceid;
    }

    public Integer getPathid() {
        return pathid;
    }

    public void setPathid(Integer pathid) {
        this.pathid = pathid;
    }
}