package oop.innerclass.a04innerclass4;

public class Test2 {
    public static void main(String[] args) {
        /*
        *      new 类/接口(){
        *          重写方法
        *      }
        * */

        //整体我们可以理解为 Swin 接口的实现类对象
        //接口多态
         Swin s = new Swin(){

            @Override
            public void swim(){
                System.out.println("重写之后游泳方法");
            }
        };

        //编译看左边，运行看右边
        s.swim();


        new Swin(){

            @Override
            public void swim(){
                System.out.println("重写之后游泳方法");
            }
        }.swim();


    }
}
