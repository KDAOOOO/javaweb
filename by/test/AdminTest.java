package com.by.test;

import com.by.bean.Admin;
import com.by.dao.AdminDaoImp;

import java.util.List;
import java.util.Scanner;

public class AdminTest {

    static Scanner sr = new Scanner(System.in);

    public static void main(String[] args) {

        AdminDaoImp ad = new AdminDaoImp();

        while (true){
            System.out.println("选择一个功能：1.添加  2.查询  3.退出");
            int key = sr.nextInt();

            switch (key){

                case 1:{

                    Admin admin = new Admin(0, "admin", "admin");
                    Admin admin1 = new Admin(0, "root", "root");
                    Admin admin2 = new Admin(0, "sys", "123456");

                    int i = ad.insertAdmin(admin);
                    int i1 = ad.insertAdmin(admin1);
                    int i2 = ad.insertAdmin(admin2);

                    if (i>0&&i1>0&&i2>0){

                        System.out.println("添加成功");

                    }else {

                        System.out.println("添加失败");

                    }

                    break;
                }

                case 2:{

                    List<Admin> admins = ad.selectAdmin();

                    admins.forEach(System.out::println);


                    break;
                }

                case 3:{

                    System.out.println("感谢使用，再见！！");
                    System.exit(0);

                    break;
                }
            }
        }
    }
}
