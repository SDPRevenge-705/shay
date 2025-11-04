package Java的基础概念.arrayDemo;

public class arrayTest6 {
    public static void main(String[] args) {
        //定义一个数组
        //交换收尾对应的元素
        int a=10;
        int b=20;
        //定义一个临时的第三方变量
        int temp = a;
        //把变量 b 的值，赋值给了 a，那么变量 a 原来记录的值就被覆盖了
        a = b;
        //就是把变量 a 原来的值，赋值给了变量 b
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
