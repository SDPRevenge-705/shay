package itheima.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //1.创建一个 StringBuilder 对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //打印
        //普及
        //因为 StringBuider 是 java 已经写好的类
        //java在底层对他做了一些特殊处理
        //打印对象不是地址值而是属性值
        System.out.println(sb);
    }
}
