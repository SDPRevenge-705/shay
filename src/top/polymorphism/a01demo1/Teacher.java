package top.polymorphism.a01demo1;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("教师姓名："+getName()+"，年龄："+getAge());
    }
}
