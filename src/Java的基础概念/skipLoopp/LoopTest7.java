package Java的基础概念.skipLoopp;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        //注意点：
        //1.生成随机数的代码        int number = random.nextInt(100)+1;//1~100
        //不能写在循环的里面的，否则每一次都会产生一个新的随机数

        //2.抽奖机制
        //用点卷钱抽水晶
        //保底 360次
        //计数器
        //用来统计当前已经猜了多少次
        int count = 0;
        //1.生成一个 1-100之间的随机数
        Random random = new Random();
        int number = random.nextInt(100)+1;//1~100
//        System.out.println(number);
        //2.猜这个数字是多少
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜的数字");
            int guess = scanner.nextInt();
            //3.判断两个数字给出不同的提示
            //猜的数字大了，提示大了
            //猜的数字小了，提示小了
            //猜的数字一样，提示猜中了
            count++;
            if (count == 3) {
                System.out.println("猜中了");
                break;
            }
            if (guess > number){
                System.out.println("大了");
            } else if (guess < number) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
