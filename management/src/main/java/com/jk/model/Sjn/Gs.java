package com.jk.model.Sjn;

public class Gs {
    private Integer id;

    private String gsname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGsname() {
        return gsname;
    }

    public void setGsname(String gsname) {
        this.gsname = gsname == null ? null : gsname.trim();
    }
}