package com.jk.model.Sjn;

import java.io.Serializable;

public class Qu implements Serializable {
    private static final long serialVersionUID = -9142754994996119317L;
    private Integer id;

    private String qname;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname == null ? null : qname.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}