package Java的基础概念.methoddemo;

public class methodTest9 {
    public static void main(String[] args) {
        //传递基本数据类型时，传递的是真实的数据，形参的改变，不影响实际参数的值
        int number = 100;
        System.out.println("调用 change 方法前："+number);//100
        number = change(number);
        System.out.println("调用 change 方法后："+number);//100  //200
    }
    public static int change(int number){//100
        number = 200;
        return number;
    }
}
