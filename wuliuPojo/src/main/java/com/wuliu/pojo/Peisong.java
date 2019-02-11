package com.wuliu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Peisong implements Serializable {

    private String pathname;
    private String fhadd;
    private String shadd;
    private BigDecimal firstprice;

    private BigDecimal cgjprice;

    private BigDecimal stjprice;

    private BigDecimal ctjprice;

    private Integer sslxn;

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    public String getFhadd() {
        return fhadd;
    }

    public void setFhadd(String fhadd) {
        this.fhadd = fhadd;
    }

    public String getShadd() {
        return shadd;
    }

    public void setShadd(String shadd) {
        this.shadd = shadd;
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

    public Peisong() {
    }

    public Peisong(String pathname, String fhadd, String shadd, BigDecimal firstprice, BigDecimal cgjprice, BigDecimal stjprice, BigDecimal ctjprice, Integer sslxn) {
        this.pathname = pathname;
        this.fhadd = fhadd;
        this.shadd = shadd;
        this.firstprice = firstprice;
        this.cgjprice = cgjprice;
        this.stjprice = stjprice;
        this.ctjprice = ctjprice;
        this.sslxn = sslxn;
    }
}
