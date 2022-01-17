package com.by.dao;

import com.by.bean.DeptAndEmp;

import java.util.List;

public interface DeptAdnEmpDao {

    public int delId(DeptAndEmp dae);

    public int insert(DeptAndEmp dae);

    public List<DeptAndEmp> findId(DeptAndEmp dae);

}
