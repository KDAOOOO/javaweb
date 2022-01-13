package com.by.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {

    static {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getCon(){

        try {
            return DriverManager.getConnection("jdbc:mysql:///newsdb_7","root","root");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;

    }
}
