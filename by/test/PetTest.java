package com.by.test;

import com.by.bean.Admin;
import com.by.bean.Pet;
import com.by.dao.PetDaoImp;

import java.util.List;
import java.util.Scanner;

public class PetTest {

    static Scanner sr = new Scanner(System.in);

    public static void main(String[] args) {

        PetDaoImp p = new PetDaoImp();

        while (true){

            System.out.println("选择功能：1.插入  2.查询  3.修改  4.删除  5.退出");
            int key = sr.nextInt();

            switch (key){

                case 1:{

                    Pet pet = new Pet(0, "1234521452", "阿黄", 1524124.51, "灰色", 5, "拉布拉多");

                    int t = p.insert(pet);

                    if (t>0){
                        System.out.println("添加成功");
                    }else {
                        System.out.println("添加失败");
                    }

                    break;
                }

                case 2:{

                    List<Pet> findall = p.findall();

                    findall.forEach(System.out::println);

                    break;
                }

                case 3:{

                    Pet pet = new Pet(0, "20210418001", null, 1500, "灰色", 0, "泰迪狗");

                    int update = p.update(pet);

                    if (update>0){
                        System.out.println("修改成功");
                    }else {
                        System.out.println("修改失败");
                    }

                    break;
                }

                case 4:{

                    Pet a = new Pet(0, null, "旺财", 0, null, 0, null);

                    int del = p.del(a);

                    if (del>0){
                        System.out.println("删除成功");
                    }else {
                        System.out.println("删除失败");
                    }

                    break;
                }

                case 5:{

                    System.out.println("感谢使用，再见！！！");

                    System.exit(0);

                    break;
                }

            }

        }

    }
}
