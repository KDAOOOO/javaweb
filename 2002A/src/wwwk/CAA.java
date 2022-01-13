package wwwk;

import sun.misc.PostVMInitHook;

import java.util.Scanner;

public class CAA {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入三角形的底：");//输入三角形的底
        int bottom = ss.nextInt();
        System.out.println("请输入三角形的高：");//输入三角形的高
        int height = ss.nextInt();
        int reulas = bottom * height / 2;//进行计算
        System.out.println("三角形的面积是：" + reulas + "平方米。");//输出结果
    }
}
