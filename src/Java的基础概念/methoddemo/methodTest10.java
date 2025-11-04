package Java的基础概念.methoddemo;

public class methodTest10 {
    public static void main(String[] args) {
        //传递引用数据类型时，传递的是地址值，形参的改变，影响实际参数的值
        int[] arr={10,20,30};
        System.out.println("调用 change 方法前："+arr[0]);//10
        change(arr);
        System.out.println("调用 change 方法后："+arr[1]);//200
    }
    public static void change(int[] arr){
        arr[1]=200;
    }
}
