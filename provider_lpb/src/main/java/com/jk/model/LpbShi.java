package com.jk.model;

import java.io.Serializable;

public class LpbShi implements Serializable {


    private static final long serialVersionUID = -5906704835026177901L;

    private int shiid;
    private String shi;
    private int jiamen;
    private String pingfen;

    public int getShiid() {
        return shiid;
    }

    public String getShi() {
        return shi;
    }

    public int getJiamen() {
        return jiamen;
    }

    public String getPingfen() {
        return pingfen;
    }

    public void setShiid(int shiid) {
        this.shiid = shiid;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public void setJiamen(int jiamen) {
        this.jiamen = jiamen;
    }

    public void setPingfen(String pingfen) {
        this.pingfen = pingfen;
    }

    @Override
    public String toString() {
        return "LpbShi{" +
                "shiid=" + shiid +
                ", shi='" + shi + '\'' +
                ", jiamen=" + jiamen +
                ", pingfen='" + pingfen + '\'' +
                '}';
    }
}
