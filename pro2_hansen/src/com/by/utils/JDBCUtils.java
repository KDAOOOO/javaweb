package com.by.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//（5）封装BaseDao工具类
//③完整工具类正确封装
public class JDBCUtils {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
//①获得连接
    public static Connection getCon(){
        try {
            return DriverManager.getConnection("jdbc:mysql:///week2","root","root");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
//②关闭连接
    public static void closes(AutoCloseable...ages){
        if (ages!=null){
            for (AutoCloseable age : ages) {
                if (age!=null){
                    try {
                        age.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
