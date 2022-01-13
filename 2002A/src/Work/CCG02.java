package Work;

import java.util.Scanner;

public class CCG02 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入一个byte值：");
        byte a = ss.nextByte();
        System.out.println("请输入一个short值：");
        short b = ss.nextShort();
        System.out.println("请输入一个int值：");
        int c = ss.nextInt();
        System.out.println("请输入一个long值：");
        long d = ss.nextLong();
        System.out.println("请输入一个float值：");
        float e = ss.nextFloat();
        System.out.println("请输入一个double值：");
        double f = ss.nextDouble();
        System.out.println("请输入一个boolean值：");
        boolean g = ss.nextBoolean();

        System.out.println("byte型变量a="+a+ ",占1个字节");
        System.out.println("short型变量b="+b+",占2个字节");
        System.out.println("int型变量c="+c+",占4个字节");
        System.out.println("long型变量d="+d+",占8个字节");
        System.out.println("float型变量e="+e+",占4个字节");
        System.out.println("double型变量f="+f+",占8个字节");
        System.out.println("boolean型变量g="+g+",占1个字节");


    }



}
