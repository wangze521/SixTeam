package com.jk.model;

import java.io.Serializable;

public class UserBean implements Serializable {


    private static final long serialVersionUID = -1644737415958431074L;
    private Integer uid;
    private String  peopleName;
    private String  peopleNum;
    private String  email;
    private Integer deptId;
    private String  addTime;
    //业务字段
    private String  deptName;
    private String  uname;
    private String  upassword;
    private String  code;


    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTypeId() {
        return deptId;
    }

    public void setTypeId(Integer typeId) {
        this.deptId = typeId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getTypeName() {
        return deptName;
    }

    public void setTypeName(String typeName) {
        this.deptName = typeName;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
