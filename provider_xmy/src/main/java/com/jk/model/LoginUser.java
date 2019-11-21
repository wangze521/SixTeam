package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class LoginUser implements Serializable {

    private static final long serialVersionUID = 7804028250018192911L;

    private Integer uid;

    private String uname;

    private String upassword;

    private Date dateTime;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}