package com.wuliu.pojo;

import java.io.Serializable;

public class Peisongdian implements Serializable {
    private Integer psdid;

    private String peisongidianname;

    private String shengfen;

    private String psphone;

    private String psemail;

    private String psxinxi;

    private static final long serialVersionUID = 1L;

    public Integer getPsdid() {
        return psdid;
    }

    public void setPsdid(Integer psdid) {
        this.psdid = psdid;
    }

    public String getPeisongidianname() {
        return peisongidianname;
    }

    public void setPeisongidianname(String peisongidianname) {
        this.peisongidianname = peisongidianname == null ? null : peisongidianname.trim();
    }

    public String getShengfen() {
        return shengfen;
    }

    public void setShengfen(String shengfen) {
        this.shengfen = shengfen == null ? null : shengfen.trim();
    }

    public String getPsphone() {
        return psphone;
    }

    public void setPsphone(String psphone) {
        this.psphone = psphone == null ? null : psphone.trim();
    }

    public String getPsemail() {
        return psemail;
    }

    public void setPsemail(String psemail) {
        this.psemail = psemail == null ? null : psemail.trim();
    }

    public String getPsxinxi() {
        return psxinxi;
    }

    public void setPsxinxi(String psxinxi) {
        this.psxinxi = psxinxi == null ? null : psxinxi.trim();
    }
}