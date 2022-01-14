package com.by.dao;

import com.by.bean.Admin;
import com.by.utils.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminJDBCImp implements AdminJDBC{
    @Override
    public List<Admin> findAll() {

        ArrayList<Admin> list = new ArrayList<>();

        String sql=" select * from admin; ";

        Connection con = JDBCutils.getCon();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                Admin admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));

                list.add(admin);

            }

            return list;

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    @Override
    public int insertAdmin(Admin admin) {

        String sql=" insert admin values(0,?,?); ";

        Connection con = JDBCutils.getCon();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,admin.getAdminName());
            ps.setString(2,admin.getAdminPwd());

            int i = ps.executeUpdate();

            return i;

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }

}
