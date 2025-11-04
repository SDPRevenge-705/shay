package Java的基础概念.ifdemo;

import java.util.Scanner;

public class ifTest3 {
    public static void main(String[] args) {
        /*需求：键盘录入一个整数，表示身上的钱。
        如果大于等于100块，就是网红餐厅。
        否则，就吃经济实惠的沙县小吃
        */

        //1.键盘录入一个整数，表示身上的钱
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入身上的钱");
        int myFashion=sc.nextInt();
        //2.对钱进行判断(二选一)
        if (myFashion>=100){
            System.out.println("吃网红餐厅");
        }else {
            System.out.println("吃经济实惠的沙县小吃");
        }

    }
}
