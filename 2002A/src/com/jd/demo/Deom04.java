package com.jd.demo;

import java.util.Scanner;

public class Deom04 {
    public static void main(String[] args) {
        Scanner AA = new Scanner(System.in);
        System.out.println("用户任意输入一个整数：");
        int a = AA.nextInt();

        double v = a * 5 / 3 + 3.1415926;
        System.out.println("a*5/3+3.1415926的结果并输出："+ v );

        int intval = (int) v;
        System.out.println("转换后结果："+intval);


    }
}
