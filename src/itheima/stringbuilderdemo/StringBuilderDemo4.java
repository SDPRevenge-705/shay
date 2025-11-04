package itheima.stringbuilderdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        //1.创建一个 StringBuilder 对象
        StringBuilder sb = new StringBuilder();

        //2.添加字符串
        sb.append("aaa").append("bbb").append("ccc").append("ddd");


        System.out.println(sb);//aaabbbcccddd

        //3.再把 Stringbuilder 变回字符串
        String str = sb.toString();
        System.out.println(str);//aaabbbcccddd
    }
}
