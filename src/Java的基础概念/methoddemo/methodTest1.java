package Java的基础概念.methoddemo;

public class methodTest1 {
    public static void main(String[] args) {
        //定义一个方法，求长方形的周长，将结果在方法中进行打印
        //根据不同的需求，选择定义无参的方法，还是带参数的方法
        getLength(5.2,1.3);
    }
    //1.我要干嘛？求长方形的周长
    //2.我干这件事情，需要什么才能完成？ 长  宽
    public static void getLength(double len,double width){
        double length = 2 * (len + width);
        System.out.println("长方形的周长是：" + length);
    }
}
