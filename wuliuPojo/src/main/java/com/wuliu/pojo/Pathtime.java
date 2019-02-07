package com.wuliu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Pathtime implements Serializable {
    private Integer pathtimeid;

    private Integer pathid;

    private Date pathtimestarttime;

    private static final long serialVersionUID = 1L;

    public Integer getPathtimeid() {
        return pathtimeid;
    }

    public void setPathtimeid(Integer pathtimeid) {
        this.pathtimeid = pathtimeid;
    }

    public Integer getPathid() {
        return pathid;
    }

    public void setPathid(Integer pathid) {
        this.pathid = pathid;
    }

    public Date getPathtimestarttime() {
        return pathtimestarttime;
    }

    public void setPathtimestarttime(Date pathtimestarttime) {
        this.pathtimestarttime = pathtimestarttime;
    }
}