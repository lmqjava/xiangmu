package com.wuliu.pojo;

import java.io.Serializable;

public class Yunlixinxi implements Serializable {
    private Integer ylxxid;

    private Integer driverlicenseld;

    private Integer pathtimeid;

    private Integer carnum;

    private String cartel;

    private String ylxxmess;

    private static final long serialVersionUID = 1L;

    public Integer getYlxxid() {
        return ylxxid;
    }

    public void setYlxxid(Integer ylxxid) {
        this.ylxxid = ylxxid;
    }

    public Integer getDriverlicenseld() {
        return driverlicenseld;
    }

    public void setDriverlicenseld(Integer driverlicenseld) {
        this.driverlicenseld = driverlicenseld;
    }

    public Integer getPathtimeid() {
        return pathtimeid;
    }

    public void setPathtimeid(Integer pathtimeid) {
        this.pathtimeid = pathtimeid;
    }

    public Integer getCarnum() {
        return carnum;
    }

    public void setCarnum(Integer carnum) {
        this.carnum = carnum;
    }

    public String getCartel() {
        return cartel;
    }

    public void setCartel(String cartel) {
        this.cartel = cartel == null ? null : cartel.trim();
    }

    public String getYlxxmess() {
        return ylxxmess;
    }

    public void setYlxxmess(String ylxxmess) {
        this.ylxxmess = ylxxmess == null ? null : ylxxmess.trim();
    }
}