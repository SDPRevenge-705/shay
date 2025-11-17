package oop.innerclass.a01innerclassdemo1;

public class Test {
    public static void main(String[] args) {
        //创建内部类的对象，并调用 show 方法
        Outer.Inner oi =new Outer().new Inner();

        oi.show();
    }
}
