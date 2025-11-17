package oop.interfacedemo.a01interfacedemo1;


public class Test {
    public static void main(String[] args) {
        //创建对象
        Frog f = new Frog("青蛙", 1);
        Dog d = new Dog("小白", 1);
        Rabbit r = new Rabbit("兔子", 1);

        f.eat();
        f.swim();
        d.eat();
        d.swim();

        System.out.println(r.getName()+","+r.getAge());
        r.eat();

    }
}
