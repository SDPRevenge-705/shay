package oop.extensdemo.a07extensdemo7;

public class ChineseDog extends Dog{
    //父类中的方法不能满足我们的需求，所以需要进行重写
    //而且中华田园犬完全用不到父类中的代码，所以不需要通过 super 进行调用
    @Override
    public void eat() {
        System.out.println("中华田园犬在吃剩饭");
    }
}
