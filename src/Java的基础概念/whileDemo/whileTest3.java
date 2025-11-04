package Java的基础概念.whileDemo;

public class whileTest3 {
    public static void main(String[] args) {
        //需求：给定两个整数，被除数和除数（都是正数，且不超过 int 的范围）
        //将两数相除，要求不使用乘法、除法和 % 运算符
        //得到商和余数

        /*
        * int a=100;
        * int b=10;
        * 100 - 10 = 90
        * 90 - 10 = 80
        * 80 - 10 = 70
        * ...
        * 10 - 10 = 0(余数)
        *
        *
        * */
        //1,定义变量记录被除数
        int dividend = 100;
        //2.定义变量记录除数
        int divisor = 37;
        //定义一个变量用来统计相减多少次
        int count = 0;
        //3.循环 while
        //在循环中，不断的用被除数 - 除数
        //只要被除数是大于等于除数的，那么就一直循环
        while (dividend >= divisor){
            dividend = dividend - divisor;
            //每相减一次，count 就 +1
            count++;
        }
        //当循环结束之后 dividen 变量记录的结束余数
        System.out.println("余数为：" + dividend);
        //当循环结束之后，count 记录的值结束商
        System.out.println("商为：" + count);
    }
}
