package com.jk.model.Sjn;

public class Cd {
    private Integer id;

    private String cdname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCdname() {
        return cdname;
    }

    public void setCdname(String cdname) {
        this.cdname = cdname == null ? null : cdname.trim();
    }
}