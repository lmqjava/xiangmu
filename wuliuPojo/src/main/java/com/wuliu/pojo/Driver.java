package com.wuliu.pojo;

import java.io.Serializable;

public class Driver implements Serializable {
    private Integer driverlicenseld;

    private Integer pathname;

    private Integer personnelid;

    private String driverremark;

    private static final long serialVersionUID = 1L;

    public Integer getDriverlicenseld() {
        return driverlicenseld;
    }

    public void setDriverlicenseld(Integer driverlicenseld) {
        this.driverlicenseld = driverlicenseld;
    }

    public Integer getPathname() {
        return pathname;
    }

    public void setPathname(Integer pathname) {
        this.pathname = pathname;
    }

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public String getDriverremark() {
        return driverremark;
    }

    public void setDriverremark(String driverremark) {
        this.driverremark = driverremark == null ? null : driverremark.trim();
    }
}