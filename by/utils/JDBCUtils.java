package com.by.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//注册驱动
public class JDBCUtils {

    private static String driverName=null;
    private static String url=null;
    private static String userName=null;
    private static String password=null;

    static{

        Properties p = new Properties();

        InputStream stream = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");

        try {
            p.load(stream);

            driverName=p.getProperty("driverName");
            url=p.getProperty("url");
            userName=p.getProperty("userName");
            password=p.getProperty("password");

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //建立连接
    public static Connection getCon(){

        try {
            return DriverManager.getConnection(url,userName,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;

    }

    //释放资源
    public static void closes(AutoCloseable... args){

        if (args!=null){

            for (AutoCloseable arg : args) {
                try {
                    arg.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
