package com.by.test;

import com.by.bean.Admin;
import com.by.jdbc.JdbcAdmin;

import java.util.List;
import java.util.Scanner;

public class AdminTest {

    static Scanner sr = new Scanner(System.in);

    public static void main(String[] args) {

        JdbcAdmin ad = new JdbcAdmin();

        while (true){

            System.out.println("选择功能：1.添加  2.查询  3.修改  4.删除  5.退出");
            int key = sr.nextInt();

            switch (key){

                case 1:{

                    ad.insertAdmin();

                    break;
                }

                case 2:{

                    List<Admin> admins = ad.selectAdmin();

                    System.out.println("     表admin里的数据");

                    admins.forEach(System.out::println);

                    break;
                }

                case 3:{

                    ad.updateAdnmin();

                    break;
                }

                case 4:{

                    ad.delAdmin();

                    break;
                }

                case 5:{

                    System.out.println("感谢使用，再见！");

                    System.exit(0);

                    break;
                }


            }


        }


    }
}
