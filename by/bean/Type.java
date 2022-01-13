package com.by.bean;

public class Type {

    private int typeid;
    private String tname;

    @Override
    public String toString() {
        return "Type{" +
                "typeid=" + typeid +
                ", tname='" + tname + '\'' +
                '}';
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Type(int typeid, String tname) {
        this.typeid = typeid;
        this.tname = tname;
    }

    public Type() {
    }
}
