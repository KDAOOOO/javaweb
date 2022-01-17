package com.by.bean;
//（6）部门和员工实体类定义正确
public class DeptAndEmp {

    private int deptid;
    private String dname;
    private int empid;
    private String ename;
    private int eage;
    private String egendar;
    private int depid;

    @Override
    public String toString() {
        return
                "部门ID：" + deptid +
                "   部门名称：" + dname +
                "   员工ID：" + empid +
                "   姓名：" + ename +
                "   年龄：" + eage +
                "   性别：" + egendar +
                "   部门ID：" + depid;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public String getEgendar() {
        return egendar;
    }

    public void setEgendar(String egendar) {
        this.egendar = egendar;
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }

    public DeptAndEmp(int deptid, String dname, int empid, String ename, int eage, String egendar, int depid) {
        this.deptid = deptid;
        this.dname = dname;
        this.empid = empid;
        this.ename = ename;
        this.eage = eage;
        this.egendar = egendar;
        this.depid = depid;
    }

    public DeptAndEmp() {
    }
}
