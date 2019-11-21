package com.jk.model.Sjn;

import java.io.Serializable;

public class Shi implements Serializable {
    private static final long serialVersionUID = 3961994839107357691L;
    private Integer id;

    private String hname;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}