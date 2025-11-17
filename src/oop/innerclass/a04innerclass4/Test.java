package oop.innerclass.a04innerclass4;

public class Test {
    public static void main(String[] args) {
        /*匿名内部类书写方式
            new 类名或者接口名（）{
                重写方法
            };
        */

        //编写匿名内部类的代码
        new Swin(){
            @Override
            public void swim() {
                System.out.println("我是匿名内部类中的 swim 方法");
            }
        };

        new Animal(){
            @Override
            public void eat() {
                System.out.println("我是匿名内部类中的 eat 方法");
            }
        };

        //在厕所类中调用下面的 method 方法？
        //以前的方式如何调用？
        //要自己写一个子类继承 Animal类
        //再创建子类的对象，传递给 method 方法
        /*Dog d = new Dog();
        mehtod(d);*/
        //如果 Dog 类我只要用一次，那么还需要单独定义一个类太麻烦了

        mehtod(
                new Animal(){
                @Override
                public void eat() {
                    System.out.println("我是匿名内部类中的 eat 方法");
                }
            }
        );

    }

    public static void mehtod(Animal a) {//Animal a = 子类对象  多态
        a.eat();//编译看左边，运行看右边
    }
}
