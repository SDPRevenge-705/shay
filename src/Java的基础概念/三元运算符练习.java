package Java的基础概念;

import java.util.Scanner;

public class 三元运算符练习 {
    public static void main(String[] args) {
        //分析：
        //1.键盘录入两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int weight2 = sc.nextInt();

        //2.比较
        String result = weight1 == weight2?"相同":"不同";
        System.out.println(result);
    }
}
