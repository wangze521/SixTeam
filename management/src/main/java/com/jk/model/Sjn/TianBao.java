package com.jk.model.Sjn;

import java.io.Serializable;

public class TianBao implements Serializable {


    private static final long serialVersionUID = 1386860849590459391L;
    private Integer id;

    private String sheng;

    private String shi;

    private String qu;

    private String company;

    private String status;

    private String wdtb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng == null ? null : sheng.trim();
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi == null ? null : shi.trim();
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu == null ? null : qu.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getWdtb() {
        return wdtb;
    }

    public void setWdtb(String wdtb) {
        this.wdtb = wdtb == null ? null : wdtb.trim();
    }
}