package oop.polymorphism.a04demo4;

public class Cat extends Animal{
    /*属性：
    年龄，颜色
    行为:
    eat(String something)方法(something表示吃的东西)
    逮老鼠catchMouse方法(无参数)
    */

    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }


    public void eat(String something){
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public void catchMouse(){
        System.out.println("猫正在逮老鼠");
    }
}
