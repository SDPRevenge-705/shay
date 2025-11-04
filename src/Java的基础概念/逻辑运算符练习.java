package Java的基础概念;

import java.util.Scanner;

public class 逻辑运算符练习 {
    public static void main(String[] args) {
        //1.键盘录入
        //变量a 变量b
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();

        //2.a == 6 || b == 6 ||（a+b)%6==0
        //如果满足其中一个，那么就可以输出true

        //短路逻辑运算符去连接三个判断
        boolean result = num1 ==6 || num2 == 6 || (num1+num2)%6 == 0;
        System.out.println(result);
    }
}
