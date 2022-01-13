package com.by.bean;

public class Pet {

    private int pid;
    private String pno;
    private String pname;
    private double pmoney;
    private String pcolor;
    private int page;
    private String typeid;


    @Override
    public String toString() {
        return "Pet{" +
                "pid=" + pid +
                ", pno='" + pno + '\'' +
                ", pname='" + pname + '\'' +
                ", pmoney=" + pmoney +
                ", pcolor='" + pcolor + '\'' +
                ", page=" + page +
                ", typeid='" + typeid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPmoney() {
        return pmoney;
    }

    public void setPmoney(double pmoney) {
        this.pmoney = pmoney;
    }

    public String getPcolor() {
        return pcolor;
    }

    public void setPcolor(String pcolor) {
        this.pcolor = pcolor;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }


    public Pet(int pid, String pno, String pname, double pmoney, String pcolor, int page, String typeid) {
        this.pid = pid;
        this.pno = pno;
        this.pname = pname;
        this.pmoney = pmoney;
        this.pcolor = pcolor;
        this.page = page;
        this.typeid = typeid;
    }

    public Pet() {
    }
}
