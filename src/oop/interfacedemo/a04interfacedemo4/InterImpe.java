package oop.interfacedemo.a04interfacedemo4;

public class InterImpe implements Inter{
    @Override
    public void method1() {
        System.out.println("这是实现类中的方法");
    }

    public static void show(){
        System.out.println("InterImpe这是实现类中的静态方法");
    }
}
