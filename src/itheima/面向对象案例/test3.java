package itheima.面向对象案例;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //键盘录入的两套体系不能混用的
        //弊端：先用 nextInt，再用 nextLine 会导致下面的 nextLine 接受不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num = sc.nextInt();
        System.out.println(num);//123
        System.out.println("请输入第二个字符串");
        String str1= sc.nextLine();
        System.out.println(str1);//789

    }
}
