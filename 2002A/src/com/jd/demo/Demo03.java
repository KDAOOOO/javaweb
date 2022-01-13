package com.jd.demo;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的底：");
        int bottom = sc.nextInt();

        System.out.println("请输入三角形的高：");
        int height = sc.nextInt();

        int result = bottom * height / 2;

        System.out.println("三角形面积是："+result+"平方米。");
    }
}
