package com.by.dao;

import com.by.bean.Admin;
import com.by.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImp implements AdminDao {

    @Override
    public List<Admin> selectAdmin() {

        ArrayList<Admin> list = new ArrayList<>();

        String sql=" select * from admin; ";

        Connection con = JDBCUtils.getCon();

        PreparedStatement ps=null;

        ResultSet rs =null;

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()){

                Admin admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));

                list.add(admin);

            }

            return list;

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally{

            JDBCUtils.closes(con,ps,rs);

        }

        return null;
    }

    @Override
    public int updataAdmin(Admin admin) {
        return 0;
    }

    @Override
    public int delAdmin(Admin admin) {
        return 0;
    }

    @Override
    public int insertAdmin(Admin admin) {

        String sql=" insert admin VALUES(0,?,?); ";

        Connection con = JDBCUtils.getCon();

        PreparedStatement ps = null;
        try {

            ps = con.prepareStatement(sql);

            ps.setString(1,admin.getAdminName());
            ps.setString(2,admin.getAdminPwd());

            int i = ps.executeUpdate();

            return i;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{

            JDBCUtils.closes(con,ps);

        }

        return 0;
    }
}
