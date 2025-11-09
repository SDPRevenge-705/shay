package top.polymorphism.a01demo1;

public class Student extends Person{
    @Override
    public void show() {
        System.out.println("学生姓名："+getName()+"，年龄："+getAge());
    }
}
