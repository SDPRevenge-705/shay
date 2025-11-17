package oop.interfacedemo.a03interfacedemo3;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("实现类中重写的抽象方法");
    }

    @Override
    public void show() {
        System.out.println("实现类中重写的默认方法");
    }
}
