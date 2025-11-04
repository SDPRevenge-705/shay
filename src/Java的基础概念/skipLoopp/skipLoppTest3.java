package Java的基础概念.skipLoopp;

import java.util.Scanner;

public class skipLoppTest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数 x，判断该整数是否为一个质数

        //质数：
        //如果一个整数只能被 1 和本身整数，那么这个数就是质数，否则这个数叫做合数
        //7 = 1 * 7
        //7 = 7 * 1
        //7 只能被 1 和 7 整除，所以 7 是一个质数

        //1.键盘录入一个正整数
        //number
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();

        //定义一个变量，表示标记
        //标记着 number 是否为一个质数
        //true：是一个质数  false：不是一个质数

        //表示最初就认为 number 是一个质数
        boolean flag = true;

        //2.判断
        //写一个循环，从 2 开始判断，一直判断到 number-1为止
        //看这个范围之内，有没有数字可以被 number 整数
        for (int i = 2; i < number; i++) {
            //i 依次表示这个范围之内的每一个数字
            //看 number 是否能被 i 整数就可以了
            if(number % i == 0){
                flag = false;
                //System.out.println(number + "不是一个质数");
                break;
            }
        }

        //只有当这个循环结束了，表示这个范围之内所以的数字都判断完毕了
        //此时才能断定 number 是一个质数
        if(flag){
            System.out.println(number + "是一个质数");
        }else {
            System.out.println(number + "不是一个质数");
        }
    }
}
