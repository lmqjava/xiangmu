package com.wuliu.pojo;

import java.io.Serializable;

public class Personnel implements Serializable {
    private Integer personnelid;

    private Integer psdid;

    private String personnelusername;

    private String personnelname;

    private String personnelgender;

    private Integer personnelage;

    private String personneladdress;

    private String personnelphone;

    private String personnelmobilephone;

    private String personnelemail;

    private String personnelpolitics;

    private String personneljob;

    private String personneldepartment;

    private String personnelentrydate;

    private Integer personnelsalary;

    private String personnelstatus;

    private String personnelpassword;

    private String personnelpasswordquestion;

    private String personnelpasswordanswer;

    private static final long serialVersionUID = 1L;

    public Integer getPersonnelid() {
        return personnelid;
    }

    public void setPersonnelid(Integer personnelid) {
        this.personnelid = personnelid;
    }

    public Integer getPsdid() {
        return psdid;
    }

    public void setPsdid(Integer psdid) {
        this.psdid = psdid;
    }

    public String getPersonnelusername() {
        return personnelusername;
    }

    public void setPersonnelusername(String personnelusername) {
        this.personnelusername = personnelusername == null ? null : personnelusername.trim();
    }

    public String getPersonnelname() {
        return personnelname;
    }

    public void setPersonnelname(String personnelname) {
        this.personnelname = personnelname == null ? null : personnelname.trim();
    }

    public String getPersonnelgender() {
        return personnelgender;
    }

    public void setPersonnelgender(String personnelgender) {
        this.personnelgender = personnelgender == null ? null : personnelgender.trim();
    }

    public Integer getPersonnelage() {
        return personnelage;
    }

    public void setPersonnelage(Integer personnelage) {
        this.personnelage = personnelage;
    }

    public String getPersonneladdress() {
        return personneladdress;
    }

    public void setPersonneladdress(String personneladdress) {
        this.personneladdress = personneladdress == null ? null : personneladdress.trim();
    }

    public String getPersonnelphone() {
        return personnelphone;
    }

    public void setPersonnelphone(String personnelphone) {
        this.personnelphone = personnelphone == null ? null : personnelphone.trim();
    }

    public String getPersonnelmobilephone() {
        return personnelmobilephone;
    }

    public void setPersonnelmobilephone(String personnelmobilephone) {
        this.personnelmobilephone = personnelmobilephone == null ? null : personnelmobilephone.trim();
    }

    public String getPersonnelemail() {
        return personnelemail;
    }

    public void setPersonnelemail(String personnelemail) {
        this.personnelemail = personnelemail == null ? null : personnelemail.trim();
    }

    public String getPersonnelpolitics() {
        return personnelpolitics;
    }

    public void setPersonnelpolitics(String personnelpolitics) {
        this.personnelpolitics = personnelpolitics == null ? null : personnelpolitics.trim();
    }

    public String getPersonneljob() {
        return personneljob;
    }

    public void setPersonneljob(String personneljob) {
        this.personneljob = personneljob == null ? null : personneljob.trim();
    }

    public String getPersonneldepartment() {
        return personneldepartment;
    }

    public void setPersonneldepartment(String personneldepartment) {
        this.personneldepartment = personneldepartment == null ? null : personneldepartment.trim();
    }

    public String getPersonnelentrydate() {
        return personnelentrydate;
    }

    public void setPersonnelentrydate(String personnelentrydate) {
        this.personnelentrydate = personnelentrydate == null ? null : personnelentrydate.trim();
    }

    public Integer getPersonnelsalary() {
        return personnelsalary;
    }

    public void setPersonnelsalary(Integer personnelsalary) {
        this.personnelsalary = personnelsalary;
    }

    public String getPersonnelstatus() {
        return personnelstatus;
    }

    public void setPersonnelstatus(String personnelstatus) {
        this.personnelstatus = personnelstatus == null ? null : personnelstatus.trim();
    }

    public String getPersonnelpassword() {
        return personnelpassword;
    }

    public void setPersonnelpassword(String personnelpassword) {
        this.personnelpassword = personnelpassword == null ? null : personnelpassword.trim();
    }

    public String getPersonnelpasswordquestion() {
        return personnelpasswordquestion;
    }

    public void setPersonnelpasswordquestion(String personnelpasswordquestion) {
        this.personnelpasswordquestion = personnelpasswordquestion == null ? null : personnelpasswordquestion.trim();
    }

    public String getPersonnelpasswordanswer() {
        return personnelpasswordanswer;
    }

    public void setPersonnelpasswordanswer(String personnelpasswordanswer) {
        this.personnelpasswordanswer = personnelpasswordanswer == null ? null : personnelpasswordanswer.trim();
    }
}