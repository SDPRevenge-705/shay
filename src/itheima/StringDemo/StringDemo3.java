package itheima.StringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.假设我现在键盘录入一个 abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();//abc  是 new 出来的
        //2.代码中再定义一个字符串 abc
        String str2 = "abc";
        //3.用==比较，这两者能一样吗？
        System.out.println(str1 == str2);//false
        //4.用equals方法比较，这两者能一样吗？
        System.out.println(str1.equals(str2));//true

        //结论：
        //以后只要想比较字符串的内容，就必须要用 String 里面的方法 equals
    }
}
