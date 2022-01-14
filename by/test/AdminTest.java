package com.by.test;

import com.by.bean.Admin;
import com.by.dao.AdminJDBCImp;

import java.util.List;
import java.util.Scanner;

public class AdminTest {

    static Scanner sr = new Scanner(System.in);

    public static void main(String[] args) {

        AdminJDBCImp ad = new AdminJDBCImp();

        while (true){

            System.out.println("选择功能：1：添加  2.查询  3.退出");
            int key = sr.nextInt();

            switch (key){

                case 1:{

                    Admin a = new Admin(0, "admin", "admin");
                    Admin a1 = new Admin(0, "root", "root");
                    Admin a2 = new Admin(0, "sys", "123456");

                    int i = ad.insertAdmin(a);
                    int i1 = ad.insertAdmin(a1);
                    int i2 = ad.insertAdmin(a2);

                    if (i>0&&i1>0&&i2>0){
                        System.out.println("添加成功");
                    }else {
                        System.out.println("添加失败");
                    }

                    break;
                }

                case 2:{

                    List<Admin> all = ad.findAll();

                    all.forEach(System.out::println);

                    break;
                }

                case 3:{

                    System.out.println("感谢使用，再见！");
                    System.exit(0);

                    break;
                }

            }


        }


    }
}
