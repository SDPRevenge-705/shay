package oop.finaldemo;

public class Test {
    public static void main(String[] args) {

        /*
        * final修饰基本数据类型：记录的值不能发生改变
        * final修饰引用数据类型：记录的地址值不能发生改变，但是地址中的内容是可以发生改变的
        *
        * 核心：
        *   常亮记录的数据是不能发生改变的。
        *
        *
        * 字符串是不可变的
        *
        * */

        final double PI = 3.14;

        //创建对象
        final Student s = new Student("张三", 18);
        //final修饰引用数据类型：记录的地址值不能发生改变，但是地址中的内容是可以发生改变的
        //s = new Student();
        s.setName("李四");
        s.setAge(20);

        System.out.println(s.toString());

        //数组
        final int[] arr = {1,2,3};
        arr[0] = 100;
        arr[1] = 200;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
