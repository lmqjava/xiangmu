package com.wuliu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Car implements Serializable {
    private Integer carid;

    private String carnum;

    private String carrunnum;

    private String cartype;

    private Float cartun;

    private String carbox;

    private Float carrii;

    private Date cartime;

    private Date timesc;

    private String carzt;

    private String pinpai;

    private String fzyuangong;

    private String careunpath;

    private String carsay;

    private static final long serialVersionUID = 1L;

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum == null ? null : carnum.trim();
    }

    public String getCarrunnum() {
        return carrunnum;
    }

    public void setCarrunnum(String carrunnum) {
        this.carrunnum = carrunnum == null ? null : carrunnum.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Float getCartun() {
        return cartun;
    }

    public void setCartun(Float cartun) {
        this.cartun = cartun;
    }

    public String getCarbox() {
        return carbox;
    }

    public void setCarbox(String carbox) {
        this.carbox = carbox == null ? null : carbox.trim();
    }

    public Float getCarrii() {
        return carrii;
    }

    public void setCarrii(Float carrii) {
        this.carrii = carrii;
    }

    public Date getCartime() {
        return cartime;
    }

    public void setCartime(Date cartime) {
        this.cartime = cartime;
    }

    public Date getTimesc() {
        return timesc;
    }

    public void setTimesc(Date timesc) {
        this.timesc = timesc;
    }

    public String getCarzt() {
        return carzt;
    }

    public void setCarzt(String carzt) {
        this.carzt = carzt == null ? null : carzt.trim();
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai == null ? null : pinpai.trim();
    }

    public String getFzyuangong() {
        return fzyuangong;
    }

    public void setFzyuangong(String fzyuangong) {
        this.fzyuangong = fzyuangong == null ? null : fzyuangong.trim();
    }

    public String getCareunpath() {
        return careunpath;
    }

    public void setCareunpath(String careunpath) {
        this.careunpath = careunpath == null ? null : careunpath.trim();
    }

    public String getCarsay() {
        return carsay;
    }

    public void setCarsay(String carsay) {
        this.carsay = carsay == null ? null : carsay.trim();
    }
}