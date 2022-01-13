package com.jd.demo;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入姓名：");
        String name = sc.next();

        System.out.println("输入年龄：");
        int age = sc.nextInt();

        System.out.println("输入体重：");
        double weight = sc.nextDouble();

        System.out.println("姓名是："+name);
        System.out.println("年龄是："+age);
        System.out.println("体重是："+weight);

    }
}
