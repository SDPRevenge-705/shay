package Java的基础概念;

public class 逻辑运算符 {
    public static void main(String[] args) {
        //1.& 并且
        //两边都为真，结果才为真
        System.out.println(true&true);//true
        System.out.println(true&false);//false
        System.out.println(false&true);//false
        System.out.println(false&false);//false

        //2.| 或者
        //两边有一个为假，结果就为假
        System.out.println(true|true);//true
        System.out.println(true|false);//true
        System.out.println(false|true);//true
        System.out.println(false|false);//false

        //3.^ 异或
        //两边不同为真，相同为假
        System.out.println(true^true);//false
        System.out.println(true^false);//true
        System.out.println(false^true);//true
        System.out.println(false^false);//false

        //！ 非
        //真变假，假变真
        //取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!true);//false
        System.out.println(!false);//true
    }
}
