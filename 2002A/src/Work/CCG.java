package Work;

import java.util.Scanner;

public class CCG {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        System.out.println("请输入三角形的底：");
        int bottom = ss.nextInt();

        System.out.println("请输入三角形的高：");
        int height = ss.nextInt();

        int result = bottom * height / 2;

        System.out.println("三角形面积是：" + result + "平方米。");
    }
}
