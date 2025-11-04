package Java的基础概念.methoddemo;

public class methodDemo3 {
    public static void main(String[] args) {
        //利用最简单的格式完成当前练习
        //在方法里面定义两个变量并求和打印
        getSum();
    }
    public static void getSum(){
        int num1 = 10;
        int num2 = 20;

        int result = num1 + num2;
        System.out.println("两个变量的和是：" + result);
    }
}
