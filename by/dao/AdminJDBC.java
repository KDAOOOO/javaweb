package com.by.dao;

import com.by.bean.Admin;

import java.util.List;

public interface AdminJDBC {

    public List<Admin> findAll();

    public int insertAdmin(Admin admin);
}
