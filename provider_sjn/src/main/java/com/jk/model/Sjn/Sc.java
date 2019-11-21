package com.jk.model.Sjn;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Sc implements Serializable {

    private static final long serialVersionUID = -8432171844210767644L;
    private Integer id;

    private String sheng;

    private String shi;

    private String qu;

    private String company;

    private String status;

    private String price;

    private String stype;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 处理从	前端到后端的时间
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")// 处理从	后端到前端的时间
    private Date sdate;

    private String simg;

    private String far;

    private String mianji;

    private String farsfz;

    private String hwy;

    private String bgry;

    private String cdsx;

    private String sname;
    private String hname;
    private String qname;

    private String statusname;
    private String cdname;
    private String gsname;

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    public String getCdname() {
        return cdname;
    }

    public void setCdname(String cdname) {
        this.cdname = cdname;
    }

    public String getGsname() {
        return gsname;
    }

    public void setGsname(String gsname) {
        this.gsname = gsname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }



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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg == null ? null : simg.trim();
    }

    public String getFar() {
        return far;
    }

    public void setFar(String far) {
        this.far = far == null ? null : far.trim();
    }

    public String getMianji() {
        return mianji;
    }

    public void setMianji(String mianji) {
        this.mianji = mianji == null ? null : mianji.trim();
    }

    public String getFarsfz() {
        return farsfz;
    }

    public void setFarsfz(String farsfz) {
        this.farsfz = farsfz == null ? null : farsfz.trim();
    }

    public String getHwy() {
        return hwy;
    }

    public void setHwy(String hwy) {
        this.hwy = hwy == null ? null : hwy.trim();
    }

    public String getBgry() {
        return bgry;
    }

    public void setBgry(String bgry) {
        this.bgry = bgry == null ? null : bgry.trim();
    }

    public String getCdsx() {
        return cdsx;
    }

    public void setCdsx(String cdsx) {
        this.cdsx = cdsx == null ? null : cdsx.trim();
    }
}