package itheima.stringbuilderdemo;

public class test4 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        //容量：最多装多少
        //长度：已经装了多少
        System.out.println(builder.capacity());//16
        System.out.println(builder.length());//0

        /*builder.append("abcdefghijklmnopqrstuvwxyz");

        System.out.println(builder.capacity());//34
        System.out.println(builder.length());//26*/

        builder.append("abcdefghijklmnopqrstuvwxyz0123456789");

        System.out.println(builder.capacity());//36
        System.out.println(builder.length());//36
    }
}
