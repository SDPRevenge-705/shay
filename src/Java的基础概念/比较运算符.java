package Java的基础概念;

public class 比较运算符 {
    public static void main(String[] args) {
        //结果都是Boolean类型
        //1.== 判断左右两边是否相等
        int a=10;
        int b=10;
        int c=20;
        System.out.println(a==b);//true
        System.out.println(a==c);//false

        //!= 判断左右两边是否不相等
        System.out.println(a!=b);//false
        System.out.println(a!=c);//true
    }
}
