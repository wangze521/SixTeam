package com.jk.model.Sjn;

import java.io.Serializable;

public class Sheng implements Serializable {
    private static final long serialVersionUID = 94107453336164803L;
    private Integer id;

    private String sname;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}