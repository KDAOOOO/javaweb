package wwwk;

import java.util.Scanner;

public class CAA01 {
    public static void main(String[] args) {//程序入口
        Scanner ss = new Scanner(System.in);
        System.out.println("请输入任意一个整数：");//输入数据
        int a = ss.nextInt();
        double v = a * 5 / 3 + 3.1415926;//进行运算
        System.out.println("a*5/3+3.1415926的结构为：" + v);//输出结果
        int intval = (int)v;//类型转换
        System.out.println("转换为int类型的结果为：" + intval);//输出结果
    }
}
