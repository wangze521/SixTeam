package com.jk.model;

import java.io.Serializable;

public class LpbSheng implements Serializable {

    private static final long serialVersionUID = -4462539271659355485L;
    private int id;
    private String sheng;
    private int jiamengshu;
    private String zonghefen;
    private int pid;
    private int lianid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public int getJiamengshu() {
        return jiamengshu;
    }

    public void setJiamengshu(int jiamengshu) {
        this.jiamengshu = jiamengshu;
    }

    public String getZonghefen() {
        return zonghefen;
    }

    public void setZonghefen(String zonghefen) {
        this.zonghefen = zonghefen;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getLianid() {
        return lianid;
    }

    public void setLianid(int lianid) {
        this.lianid = lianid;
    }

    @Override
    public String toString() {
        return "LpbSheng{" +
                "id=" + id +
                ", sheng='" + sheng + '\'' +
                ", jiamengshu=" + jiamengshu +
                ", zonghefen='" + zonghefen + '\'' +
                ", pid=" + pid +
                ", lianid=" + lianid +
                '}';
    }
}
