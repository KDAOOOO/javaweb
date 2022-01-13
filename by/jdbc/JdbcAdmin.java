package com.by.jdbc;

import com.by.bean.Admin;
import com.by.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcAdmin {

    public void insertAdmin(){

        String sql=" insert admin VALUES(0,'admin_1','123456'),(0,'admin_2','654321'),(0,'admin_3','abcdefg'); ";

        Connection con = JdbcUtils.getCon();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            int i = ps.executeUpdate();

            System.out.println("插入"+i+"条记录，");
            System.out.println("数据添加成功！");

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Admin> selectAdmin(){

        ArrayList<Admin> list = new ArrayList<>();

        String sql=" select * from admin; ";

        Connection con = JdbcUtils.getCon();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                Admin admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));

                list.add(admin);

            }

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return list;
    }

    public void updateAdnmin(){

        String sql=" update admin set adminPwd=666999 where adminName='admin_3'; ";

        Connection con = JdbcUtils.getCon();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            int i = ps.executeUpdate();

            System.out.println("更新"+i+"条记录，");
            System.out.println("数据更新成功！");

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

    public void delAdmin(){

        String sql=" delete from admin where adminName='admin_2'; ";

        Connection con = JdbcUtils.getCon();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            int i = ps.executeUpdate();

            System.out.println("删除"+i+"条记录，");
            System.out.println("数据删除成功！");

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

}
