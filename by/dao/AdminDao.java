package com.by.dao;

import com.by.bean.Admin;

import java.util.List;

public interface AdminDao {

    public List<Admin> selectAdmin();

    public int updataAdmin(Admin admin);

    public int delAdmin(Admin admin);

    public int insertAdmin(Admin admin);

}
