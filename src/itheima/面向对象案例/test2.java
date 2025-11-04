package itheima.面向对象案例;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //键盘录入：
        //第一套体系
        //nextInt():接受整数
        //nextDouble():接受小数
        //next():接受字符串
        //遇到空格，制表符，回车就停止接受。这些符号后面的数据就不会接受了

        //第二套体系
        //nextLine():接受字符串
        //可以接受空格，制表符，遇到回车才停止接受数据

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num= sc.nextInt();//123  123
        System.out.println(num);//123
        System.out.println("请输入第二个整数");
        int num1= sc.nextInt();
        System.out.println(num1);//123*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.println("请输入二个字符串");
        String str2 = sc.next();
        System.out.println(str2);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String ine1 = sc.nextLine();
        System.out.println(ine1);
        System.out.println("请输入第二个字符串");
        String ine2 = sc.nextLine();
        System.out.println(ine2);

    }
}
