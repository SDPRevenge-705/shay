package Java的基础概念;

public class 强制转换 {
    public static void main(String[] args) {
        byte b1=100;
        byte b2=100;
        //现在我们要强转的是谁？
        //b1+b2计算之后的结果。
        //(byte)b1+b2强转的是b1，并不是最终结果
        byte result= (byte) (b1+b2);
        System.out.println(result);//结果就发生错误，转换的数据过大
    }
}
