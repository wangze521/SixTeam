package com.jk.model.fwt;

import java.io.Serializable;
import java.util.Date;

public class DeptBean implements Serializable {


    private static final long serialVersionUID = -2560044733819346310L;
    private Integer deptId;

    private String deptName;

    private String deptShow;

    private String deptCount;

    private Date deptTime;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptShow() {
        return deptShow;
    }

    public void setDeptShow(String deptShow) {
        this.deptShow = deptShow;
    }

    public String getDeptCount() {
        return deptCount;
    }

    public void setDeptCount(String deptCount) {
        this.deptCount = deptCount;
    }

    public Date getDeptTime() {
        return deptTime;
    }

    public void setDeptTime(Date deptTime) {
        this.deptTime = deptTime;
    }
}