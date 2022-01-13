package com.by.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PetJDBCutils {

    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getCon(){
        try {
            return DriverManager.getConnection("jdbc:mysql:///newsdb_6","root","root");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void closes(AutoCloseable...ss){

        if (ss!=null){

            for (AutoCloseable s : ss) {

                try {
                    s.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
    }

}
