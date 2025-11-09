package top.polymorphism.a01demo1;

public class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员姓名："+getName()+"，年龄："+getAge());
    }
}
