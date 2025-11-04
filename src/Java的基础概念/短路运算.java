package Java的基础概念;

public class 短路运算 {
    public static void main(String[] args) {
        //1.&& 与
        //两边都为真，结果才为真
        System.out.println(true&&true);//true
        System.out.println(true&&false);//false
        System.out.println(false&&true);//false
        System.out.println(false&&false);//false

        //2.|| 或
        //两边有一个为真，结果就为真
        System.out.println(true||true);//true
        System.out.println(true||false);//true
        System.out.println(false||true);//true
        System.out.println(false||false);//false

        //3.短路逻辑运算符具有短路效果
        //简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运算
        int a = 10;
        int b = 10;
        boolean result = ++a <5 && ++b<5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//10
    }
}
