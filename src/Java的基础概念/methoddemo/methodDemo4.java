package Java的基础概念.methoddemo;

public class methodDemo4 {
    public static void main(String[] args) {
        //掌握带参数方法定义的格式和调用的格式
        getSum(10,20);
        getSum(100,200);
    }
    public static void getSum(int num1,int num2){
        int result = num1 + num2;
        System.out.println("两个变量的和是：" + result);
    }
}
