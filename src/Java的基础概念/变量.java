package Java的基础概念;

public class 变量 {
    public static void main(String[] args) {
        //定义变量
        //数据类型 变量名=数据值；
        //数据类型：限定了变量能存储数据的类型
        //int（整数） double（小数）
        //变量名；就是存储空间的名字
        //作用：放便以后使用
        //数据值：真正存在变量中的数据
        //等号：赋值。把右边的数据赋值给左边的变量

        int a=10;
        System.out.println(a);//10
        //变量参与计算
        int b=20;
        System.out.println(a+b);//30
        //修改变量记录的值
        a=20;
        System.out.println(a);//20

        //注意事项
        //在一条语句中，可以定义多个变量
        int d=100,e=200,f=300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //变量在使用之前必须要赋值
        int g;
        g=500;
        //建议：以后在定义变量的时候，请直接赋值
        //不要把赋值分开写
        System.out.println(g);

    }
}
