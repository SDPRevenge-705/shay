package Java的基础概念.skipLoopp;

import java.util.Random;

public class skipLoppTest6 {
    public static void main(String[] args) {
        //需求：随机数范围：1～100
        //创建对象
        Random random = new Random();
        //生成随机数
        int number = random.nextInt(100)+1;//1~100
        System.out.println(number);



        //秘诀
        //用来生成任意数到任意数之间的随机数 7~15
        //1.让这个范围头尾都减去一个值，让这个范围从 0 开始 -7 0～8
        //2.尾巴+1  8+1=9
        //3.最终的结果，再加上第一步减去的值

//        Random random = new Random();
//        //生成随机数
//        int number = random.nextInt(9)+7;//7~15
//                // 0~8 +7
//        System.out.println(number);


        }
}
