package itheima.StringDemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.统计 --- 计数器思想
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //i依次表示字符串中的每一个索引
            char c = str.charAt(i);
            if (c >='a' && c <='z'){
                //char类型的变量在参与计算的时候自动类型提升为 int 查询 ascii 码表
                smallCount++;
            }else  if (c >='A' && c <='Z'){
                bigCount++;
            }else if (c >='0' && c <='9'){
                numberCount++;
            }
        }
        //3.输出结果
        System.out.println("大写字母有：" + bigCount + "个");
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("数字有：" + numberCount + "个");
    }
}
