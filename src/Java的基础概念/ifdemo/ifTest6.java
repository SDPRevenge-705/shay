package Java的基础概念.ifdemo;

import java.util.Scanner;

public class ifTest6 {
    public static void main(String[] args) {
//        根据不同的分数送不同的礼物。
//        如果是95~100分，送自行车一辆
//        如果是90~94分，游乐场玩一天
//        如果是80~89分，送变形金刚一个。
//        如果是80分，揍一顿。

        //1.键盘录入小明的考试成绩
        Scanner sc=new Scanner(System.in);
        System.out.println("<请输入小明的考试成绩>");
        int number=sc.nextInt();

        //对异常的数据进行判断校验
        //0～100合理数据
        if (number>0 && number<=100){
            //2.根据不同的考试成绩,送不同的礼物
            if (number>=95 && number<=100){
                System.out.println("送自行车一辆");
            }else if (number>=90 && number<=94){
                System.out.println("游乐场玩一天");
            }else if (number>=80 && number<=89){
                System.out.println("送变形金刚一个");
            }else{
                System.out.println("揍一顿");
            }
        }else{
            System.out.println("当前录入的成绩不合法");
        }


    }
}
