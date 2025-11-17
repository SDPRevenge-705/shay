package oop.abstarctdemo.a01demo1test;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Frog frog = new Frog("青蛙",1);
        Dog dog = new Dog("狗",2);
        Sheep sheep = new Sheep("羊",3);

        //调用方法
        frog.drink();
        frog.eat();
        dog.drink();
        dog.eat();
        sheep.drink();
        sheep.eat();

        System.out.println(frog.getName()+frog.getAge());

    }
}
