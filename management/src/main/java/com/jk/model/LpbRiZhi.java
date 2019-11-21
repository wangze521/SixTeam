package com.jk.model;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "shixunyi")
public class LpbRiZhi implements Serializable {


    private static final long serialVersionUID = 6619639758702986055L;
    private String moginid;
    private String moginname;
    private String moginip;
    private String moginjiid;
    private String mongincao;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date mogindate;

    public String getMoginid() {
        return moginid;
    }

    public void setMoginid(String moginid) {
        this.moginid = moginid;
    }

    public String getMoginname() {
        return moginname;
    }

    public void setMoginname(String moginname) {
        this.moginname = moginname;
    }

    public String getMoginip() {
        return moginip;
    }

    public void setMoginip(String moginip) {
        this.moginip = moginip;
    }

    public Date getMogindate() {
        return mogindate;
    }

    public void setMogindate(Date mogindate) {
        this.mogindate = mogindate;
    }

    public String getMoginjiid() {
        return moginjiid;
    }

    public void setMoginjiid(String moginjiid) {
        this.moginjiid = moginjiid;
    }

    public String getMongincao() {
        return mongincao;
    }

    public void setMongincao(String mongincao) {
        this.mongincao = mongincao;
    }

    @Override
    public String toString() {
        return "LpbRiZhi{" +
                "moginid='" + moginid + '\'' +
                ", moginname='" + moginname + '\'' +
                ", moginip='" + moginip + '\'' +
                ", moginjiid='" + moginjiid + '\'' +
                ", mongincao='" + mongincao + '\'' +
                ", mogindate=" + mogindate +
                '}';
    }
}
