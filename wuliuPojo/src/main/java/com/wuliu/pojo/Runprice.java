package com.wuliu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Runprice implements Serializable {
    private Integer runpriceid;

    private String fhadd;

    private String shadd;

    private BigDecimal firstprice;

    private BigDecimal cgjprice;

    private BigDecimal stjprice;

    private BigDecimal ctjprice;

    private Integer sslxn;

    private static final long serialVersionUID = 1L;

    public Integer getRunpriceid() {
        return runpriceid;
    }

    public void setRunpriceid(Integer runpriceid) {
        this.runpriceid = runpriceid;
    }

    public String getFhadd() {
        return fhadd;
    }

    public void setFhadd(String fhadd) {
        this.fhadd = fhadd == null ? null : fhadd.trim();
    }

    public String getShadd() {
        return shadd;
    }

    public void setShadd(String shadd) {
        this.shadd = shadd == null ? null : shadd.trim();
    }

    public BigDecimal getFirstprice() {
        return firstprice;
    }

    public void setFirstprice(BigDecimal firstprice) {
        this.firstprice = firstprice;
    }

    public BigDecimal getCgjprice() {
        return cgjprice;
    }

    public void setCgjprice(BigDecimal cgjprice) {
        this.cgjprice = cgjprice;
    }

    public BigDecimal getStjprice() {
        return stjprice;
    }

    public void setStjprice(BigDecimal stjprice) {
        this.stjprice = stjprice;
    }

    public BigDecimal getCtjprice() {
        return ctjprice;
    }

    public void setCtjprice(BigDecimal ctjprice) {
        this.ctjprice = ctjprice;
    }

    public Integer getSslxn() {
        return sslxn;
    }

    public void setSslxn(Integer sslxn) {
        this.sslxn = sslxn;
    }
}