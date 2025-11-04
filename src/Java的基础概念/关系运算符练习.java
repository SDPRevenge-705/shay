package Java的基础概念;

import java.util.Scanner;

public class 关系运算符练习 {
    public static void main(String[] args) {
        //1.键盘录入两个整数表示衣服的时髦度
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入我们自己衣服的时髦度");
        int myFashion=sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度");
        int yourFashion=sc.nextInt();

        //2.把我们的衣服时髦度和女孩的时髦度进行对比
        boolean result=myFashion==yourFashion;

        //3.打印结果
        System.out.println(result);
    }
}
