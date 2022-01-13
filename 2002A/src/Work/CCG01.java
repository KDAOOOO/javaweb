package Work;

import java.util.Scanner;

public class CCG01 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        System.out.println("请输入任意一个整数：");
        int a = ss.nextInt();
        double v = a*5/3+3.1415926;
        System.out.println("a*5/3+3.1415926的结果为："+v);
        int intavl=(int)v;
        System.out.println("转换为int类型的结果为："+intavl);

    }


}
