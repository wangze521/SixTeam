package com.jk.model;

import java.io.Serializable;

public class InstaModel implements Serializable {

    private static final long serialVersionUID = 7535769178807663491L;
    private Integer id;

    private String platformname;

    private String platformheadline;

    private String platformdescription;

    private String keyword;

    private String platformlogd;

    private String customerhotline;

    private String customermailbox;

    private String configuration;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlatformname() {
        return platformname;
    }

    public void setPlatformname(String platformname) {
        this.platformname = platformname == null ? null : platformname.trim();
    }

    public String getPlatformheadline() {
        return platformheadline;
    }

    public void setPlatformheadline(String platformheadline) {
        this.platformheadline = platformheadline == null ? null : platformheadline.trim();
    }

    public String getPlatformdescription() {
        return platformdescription;
    }

    public void setPlatformdescription(String platformdescription) {
        this.platformdescription = platformdescription == null ? null : platformdescription.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getPlatformlogd() {
        return platformlogd;
    }

    public void setPlatformlogd(String platformlogd) {
        this.platformlogd = platformlogd == null ? null : platformlogd.trim();
    }

    public String getCustomerhotline() {
        return customerhotline;
    }

    public void setCustomerhotline(String customerhotline) {
        this.customerhotline = customerhotline == null ? null : customerhotline.trim();
    }

    public String getCustomermailbox() {
        return customermailbox;
    }

    public void setCustomermailbox(String customermailbox) {
        this.customermailbox = customermailbox == null ? null : customermailbox.trim();
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration == null ? null : configuration.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "InstaModel{" +
                "id=" + id +
                ", platformname='" + platformname + '\'' +
                ", platformheadline='" + platformheadline + '\'' +
                ", platformdescription='" + platformdescription + '\'' +
                ", keyword='" + keyword + '\'' +
                ", platformlogd='" + platformlogd + '\'' +
                ", customerhotline='" + customerhotline + '\'' +
                ", customermailbox='" + customermailbox + '\'' +
                ", configuration='" + configuration + '\'' +
                ", pid=" + pid +
                '}';
    }
}