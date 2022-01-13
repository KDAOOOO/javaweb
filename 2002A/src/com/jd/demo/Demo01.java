package com.jd.demo;

import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("姓名是："+name);
            System.out.println("年龄是："+age);
    }
}

