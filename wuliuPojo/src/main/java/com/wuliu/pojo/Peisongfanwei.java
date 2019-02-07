package com.wuliu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Peisongfanwei implements Serializable {
    private Integer psfwid;

    private Integer psdid;

    private String psfwname;

    private BigDecimal pszhongliangprice;

    private BigDecimal pszhiliangprice;

    private BigDecimal pfmiaoshu;

    private String psshenhe;

    private String shenhezhuangtai;

    private static final long serialVersionUID = 1L;

    public Integer getPsfwid() {
        return psfwid;
    }

    public void setPsfwid(Integer psfwid) {
        this.psfwid = psfwid;
    }

    public Integer getPsdid() {
        return psdid;
    }

    public void setPsdid(Integer psdid) {
        this.psdid = psdid;
    }

    public String getPsfwname() {
        return psfwname;
    }

    public void setPsfwname(String psfwname) {
        this.psfwname = psfwname == null ? null : psfwname.trim();
    }

    public BigDecimal getPszhongliangprice() {
        return pszhongliangprice;
    }

    public void setPszhongliangprice(BigDecimal pszhongliangprice) {
        this.pszhongliangprice = pszhongliangprice;
    }

    public BigDecimal getPszhiliangprice() {
        return pszhiliangprice;
    }

    public void setPszhiliangprice(BigDecimal pszhiliangprice) {
        this.pszhiliangprice = pszhiliangprice;
    }

    public BigDecimal getPfmiaoshu() {
        return pfmiaoshu;
    }

    public void setPfmiaoshu(BigDecimal pfmiaoshu) {
        this.pfmiaoshu = pfmiaoshu;
    }

    public String getPsshenhe() {
        return psshenhe;
    }

    public void setPsshenhe(String psshenhe) {
        this.psshenhe = psshenhe == null ? null : psshenhe.trim();
    }

    public String getShenhezhuangtai() {
        return shenhezhuangtai;
    }

    public void setShenhezhuangtai(String shenhezhuangtai) {
        this.shenhezhuangtai = shenhezhuangtai == null ? null : shenhezhuangtai.trim();
    }
}