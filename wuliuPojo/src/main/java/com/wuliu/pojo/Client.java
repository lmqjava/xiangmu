package com.wuliu.pojo;

import java.io.Serializable;

public class Client implements Serializable {
    private Integer clientid;

    private String clientusername;

    private String clientaddress;

    private String clientphone;

    private String clientemail;

    private String clientpassword;

    private String clientpasswordquestion;

    private String clientpasswordanswer;

    private static final long serialVersionUID = 1L;

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public String getClientusername() {
        return clientusername;
    }

    public void setClientusername(String clientusername) {
        this.clientusername = clientusername == null ? null : clientusername.trim();
    }

    public String getClientaddress() {
        return clientaddress;
    }

    public void setClientaddress(String clientaddress) {
        this.clientaddress = clientaddress == null ? null : clientaddress.trim();
    }

    public String getClientphone() {
        return clientphone;
    }

    public void setClientphone(String clientphone) {
        this.clientphone = clientphone == null ? null : clientphone.trim();
    }

    public String getClientemail() {
        return clientemail;
    }

    public void setClientemail(String clientemail) {
        this.clientemail = clientemail == null ? null : clientemail.trim();
    }

    public String getClientpassword() {
        return clientpassword;
    }

    public void setClientpassword(String clientpassword) {
        this.clientpassword = clientpassword == null ? null : clientpassword.trim();
    }

    public String getClientpasswordquestion() {
        return clientpasswordquestion;
    }

    public void setClientpasswordquestion(String clientpasswordquestion) {
        this.clientpasswordquestion = clientpasswordquestion == null ? null : clientpasswordquestion.trim();
    }

    public String getClientpasswordanswer() {
        return clientpasswordanswer;
    }

    public void setClientpasswordanswer(String clientpasswordanswer) {
        this.clientpasswordanswer = clientpasswordanswer == null ? null : clientpasswordanswer.trim();
    }
}