package com.by.dao;

import com.by.bean.Pet;
import com.by.utils.PetJDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PetDaoImp implements PetDao{
    @Override
    public List<Pet> findall() {

        ArrayList<Pet> list = new ArrayList<>();

        String sql=" select * from t_pet where typeid='波斯猫';";

        Connection con = PetJDBCutils.getCon();

        PreparedStatement ps =null;
        ResultSet rs =null;

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()){

                Pet pet = new Pet(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getInt(6), rs.getString(7));

                list.add(pet);

            }

            return list;

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {

            PetJDBCutils.closes(rs,ps,con);

        }

        return null;
    }

    @Override
    public int insert(Pet pet) {

        String sql=" insert t_pet values(0,?,?,?,?,?,?); ";

        Connection con = PetJDBCutils.getCon();

        PreparedStatement ps =null;

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1,pet.getPno());
            ps.setString(2,pet.getPname());
            ps.setDouble(3,pet.getPmoney());
            ps.setString(4,pet.getPcolor());
            ps.setInt(5,pet.getPage());
            ps.setString(6,pet.getTypeid());

            int i = ps.executeUpdate();

            return i;

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {

            PetJDBCutils.closes(ps,con);

        }

        return 0;
    }

    @Override
    public int update(Pet pet) {

        String sql=" update t_pet set pcolor=?,pmoney=?,typeid=? where pno=?; ";

        Connection con = PetJDBCutils.getCon();

        PreparedStatement ps =null;

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1,pet.getPcolor());
            ps.setDouble(2,pet.getPmoney());
            ps.setString(3,pet.getTypeid());
            ps.setString(4,pet.getPno());

            int i = ps.executeUpdate();

            return i;

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {
            PetJDBCutils.closes(ps,con);
        }

        return 0;
    }

    @Override
    public int del(Pet pet) {

        String sql=" delete from t_pet where pname=?;";

        Connection con = PetJDBCutils.getCon();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,pet.getPname());

            int i = ps.executeUpdate();

            return i;

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return 0;
    }
}
