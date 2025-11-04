package itheima.stringtest;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
            返回字符串中最后一个单词的长度。
            单词是指仅由字母组成、不包含任何空格字符的最大子字符串。

            示例 1:输入:s="Hello World” 输出:5
            解释:最后一个单词是“World”，长度为5

            示例 2:输入:s="fly me tothe moon " 输出:4
            解释:最后一个单词是“moon”，长度为4。

            示例 3:输入:s="luffy is still joyboy"   输出:6
            解释:最后一个单词是长度为6的“joyboy”。
            */

        //倒着遍历
        //直到遇到空格位置
        //那么遍历的次数就是单词的长度

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个单词，并用空格隔开");
        String s = sc.nextLine();
        System.out.println(s);
        //1.先把字符串变成字符数组
        char[] chars = s.toCharArray();

        //2.倒着遍历字符数组
        int count = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            //3.判断是否是空格
            if (chars[i] != ' ') {
                //4.不是空格,那么就统计单词的长度
                count++;
            } else {
                //5.如果是空格,那么就判断是否统计过单词的长度
                if (count > 0) {
                    //6.如果统计过单词的长度,那么就直接跳出循环
                    break;
                }
            }
        }

        //7.最后输出单词的长度
        System.out.println(count);

    }
}
