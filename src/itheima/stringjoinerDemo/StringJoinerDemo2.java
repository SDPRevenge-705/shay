package itheima.stringjoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("，", "[", "]");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc").add("ddd");

        int len = sj.length();//符号也算
        System.out.println(len);//17

        //3.打印
        System.out.println(sj);//[aaa，bbb，ccc，ddd]

        String s = sj.toString();//转换成字符串
        System.out.println(s);//[aaa，bbb，ccc，ddd]
    }
}
