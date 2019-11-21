package com.jk.model;

import java.io.Serializable;

public class LpbSheng implements Serializable {

    private static final long serialVersionUID = -4462539271659355485L;
    private int id;
    private String sheng;
    private int jiamengshu;
    private String zonghefen;
    private int pid;

    public int getId() {
        return id;
    }

    public String getSheng() {
        return sheng;
    }

    public int getJiamengshu() {
        return jiamengshu;
    }

    public String getZonghefen() {
        return zonghefen;
    }

    public int getPid() {
        return pid;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public void setJiamengshu(int jiamengshu) {
        this.jiamengshu = jiamengshu;
    }

    public void setZonghefen(String zonghefen) {
        this.zonghefen = zonghefen;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "LpbSheng{" +
                "id=" + id +
                ", sheng='" + sheng + '\'' +
                ", jiamengshu=" + jiamengshu +
                ", zonghefen='" + zonghefen + '\'' +
                ", pid=" + pid +
                '}';
    }
}
