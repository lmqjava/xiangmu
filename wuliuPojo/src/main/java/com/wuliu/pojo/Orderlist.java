package com.wuliu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Orderlist implements Serializable {
    private Integer orderlistid;

    private Integer clientid;

    private String orderliststatus;

    private String startstationid;

    private String endstationid;

    private Float orderlistweight;

    private Float orderlistvolume;

    private Float orderlistdeliverprice;

    private Float orderlistdispatchprice;

    private Float orderlistassuretprice;

    private Float orderlistassurevalue;

    private Float orderlistassureprice;

    private Date orderlistdate;

    private String orderlistreceivername;

    private String orderlistreceiverphone;

    private String orderlistreceivermobil;

    private String orderlistreceiveraddress;

    private String orderlistreceiverpostc;

    private String orderlistsendername;

    private String orderlistsenderfax;

    private String orderlistsenderpostcode;

    private String orderlistsenderphone;

    private String orderlistsenderemail;

    private Date orderrequestdate;

    private String orderlistremark;

    private Integer orderlistidentifycode;

    private static final long serialVersionUID = 1L;

    public Integer getOrderlistid() {
        return orderlistid;
    }

    public void setOrderlistid(Integer orderlistid) {
        this.orderlistid = orderlistid;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public String getOrderliststatus() {
        return orderliststatus;
    }

    public void setOrderliststatus(String orderliststatus) {
        this.orderliststatus = orderliststatus == null ? null : orderliststatus.trim();
    }

    public String getStartstationid() {
        return startstationid;
    }

    public void setStartstationid(String startstationid) {
        this.startstationid = startstationid == null ? null : startstationid.trim();
    }

    public String getEndstationid() {
        return endstationid;
    }

    public void setEndstationid(String endstationid) {
        this.endstationid = endstationid == null ? null : endstationid.trim();
    }

    public Float getOrderlistweight() {
        return orderlistweight;
    }

    public void setOrderlistweight(Float orderlistweight) {
        this.orderlistweight = orderlistweight;
    }

    public Float getOrderlistvolume() {
        return orderlistvolume;
    }

    public void setOrderlistvolume(Float orderlistvolume) {
        this.orderlistvolume = orderlistvolume;
    }

    public Float getOrderlistdeliverprice() {
        return orderlistdeliverprice;
    }

    public void setOrderlistdeliverprice(Float orderlistdeliverprice) {
        this.orderlistdeliverprice = orderlistdeliverprice;
    }

    public Float getOrderlistdispatchprice() {
        return orderlistdispatchprice;
    }

    public void setOrderlistdispatchprice(Float orderlistdispatchprice) {
        this.orderlistdispatchprice = orderlistdispatchprice;
    }

    public Float getOrderlistassuretprice() {
        return orderlistassuretprice;
    }

    public void setOrderlistassuretprice(Float orderlistassuretprice) {
        this.orderlistassuretprice = orderlistassuretprice;
    }

    public Float getOrderlistassurevalue() {
        return orderlistassurevalue;
    }

    public void setOrderlistassurevalue(Float orderlistassurevalue) {
        this.orderlistassurevalue = orderlistassurevalue;
    }

    public Float getOrderlistassureprice() {
        return orderlistassureprice;
    }

    public void setOrderlistassureprice(Float orderlistassureprice) {
        this.orderlistassureprice = orderlistassureprice;
    }

    public Date getOrderlistdate() {
        return orderlistdate;
    }

    public void setOrderlistdate(Date orderlistdate) {
        this.orderlistdate = orderlistdate;
    }

    public String getOrderlistreceivername() {
        return orderlistreceivername;
    }

    public void setOrderlistreceivername(String orderlistreceivername) {
        this.orderlistreceivername = orderlistreceivername == null ? null : orderlistreceivername.trim();
    }

    public String getOrderlistreceiverphone() {
        return orderlistreceiverphone;
    }

    public void setOrderlistreceiverphone(String orderlistreceiverphone) {
        this.orderlistreceiverphone = orderlistreceiverphone == null ? null : orderlistreceiverphone.trim();
    }

    public String getOrderlistreceivermobil() {
        return orderlistreceivermobil;
    }

    public void setOrderlistreceivermobil(String orderlistreceivermobil) {
        this.orderlistreceivermobil = orderlistreceivermobil == null ? null : orderlistreceivermobil.trim();
    }

    public String getOrderlistreceiveraddress() {
        return orderlistreceiveraddress;
    }

    public void setOrderlistreceiveraddress(String orderlistreceiveraddress) {
        this.orderlistreceiveraddress = orderlistreceiveraddress == null ? null : orderlistreceiveraddress.trim();
    }

    public String getOrderlistreceiverpostc() {
        return orderlistreceiverpostc;
    }

    public void setOrderlistreceiverpostc(String orderlistreceiverpostc) {
        this.orderlistreceiverpostc = orderlistreceiverpostc == null ? null : orderlistreceiverpostc.trim();
    }

    public String getOrderlistsendername() {
        return orderlistsendername;
    }

    public void setOrderlistsendername(String orderlistsendername) {
        this.orderlistsendername = orderlistsendername == null ? null : orderlistsendername.trim();
    }

    public String getOrderlistsenderfax() {
        return orderlistsenderfax;
    }

    public void setOrderlistsenderfax(String orderlistsenderfax) {
        this.orderlistsenderfax = orderlistsenderfax == null ? null : orderlistsenderfax.trim();
    }

    public String getOrderlistsenderpostcode() {
        return orderlistsenderpostcode;
    }

    public void setOrderlistsenderpostcode(String orderlistsenderpostcode) {
        this.orderlistsenderpostcode = orderlistsenderpostcode == null ? null : orderlistsenderpostcode.trim();
    }

    public String getOrderlistsenderphone() {
        return orderlistsenderphone;
    }

    public void setOrderlistsenderphone(String orderlistsenderphone) {
        this.orderlistsenderphone = orderlistsenderphone == null ? null : orderlistsenderphone.trim();
    }

    public String getOrderlistsenderemail() {
        return orderlistsenderemail;
    }

    public void setOrderlistsenderemail(String orderlistsenderemail) {
        this.orderlistsenderemail = orderlistsenderemail == null ? null : orderlistsenderemail.trim();
    }

    public Date getOrderrequestdate() {
        return orderrequestdate;
    }

    public void setOrderrequestdate(Date orderrequestdate) {
        this.orderrequestdate = orderrequestdate;
    }

    public String getOrderlistremark() {
        return orderlistremark;
    }

    public void setOrderlistremark(String orderlistremark) {
        this.orderlistremark = orderlistremark == null ? null : orderlistremark.trim();
    }

    public Integer getOrderlistidentifycode() {
        return orderlistidentifycode;
    }

    public void setOrderlistidentifycode(Integer orderlistidentifycode) {
        this.orderlistidentifycode = orderlistidentifycode;
    }
}