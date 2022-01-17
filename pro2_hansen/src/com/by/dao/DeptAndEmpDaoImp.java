package com.by.dao;

import com.by.bean.DeptAndEmp;
import com.by.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptAndEmpDaoImp implements DeptAdnEmpDao{

    //（7）使用Statement完成部门表删除功能（根据部门ID删除指定的部门，同时通过触发器在删除部门的时候把该部门的员工同时删掉）
    //①dao中删除方法编写正确（删除方法参数为部门ID，有返回值，返回类型自拟）
    @Override
    public int delId(DeptAndEmp dae) {

        String sql=" DELETE FROM emp WHERE depid=?; ";

        Connection con = JDBCUtils.getCon();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,dae.getDeptid());

            int i = ps.executeUpdate();

            return i;


        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }


    //（8）使用PreparedStatement完成员工增加功能（增加成功和失败后台均有提示，提示内容自拟）

    //③dao中增加方法编写正确（增加方法参数为员工对象，有返回值类型自拟）
    @Override
    public int insert(DeptAndEmp dae) {

        //②Sql语句编写正确(5分）
        String sql=" insert emp values(0,?,?,?,?); ";

        Connection con = JDBCUtils.getCon();

        PreparedStatement ps =null;

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1,dae.getEname());
            ps.setInt(2,dae.getEage());
            ps.setString(3,dae.getEgendar());
            ps.setInt(4,dae.getDepid());

            int i = ps.executeUpdate();

            return i;

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.closes(ps,con);
        }

        return 0;
    }


    //
    @Override
    public List<DeptAndEmp> findId(DeptAndEmp dae) {

        ArrayList<DeptAndEmp> list = new ArrayList<>();

        //①Sql语句编写正确
        String sql=" select * from dept left join emp on dept.deptid=emp.depid where dept.dname=?; ";

        Connection con = JDBCUtils.getCon();

        PreparedStatement ps =null;
        ResultSet rs =null;

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1,dae.getDname());

            rs = ps.executeQuery();

            while (rs.next()){

                DeptAndEmp deptAndEmp = new DeptAndEmp(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7));

                list.add(deptAndEmp);

            }
            //②dao查询员工的方法最终要返回员工集合（
            return list;

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.closes(rs,ps,con);
        }

        return null;
    }
}
