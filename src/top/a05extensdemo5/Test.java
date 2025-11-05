package top.a05extensdemo5;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}


class Fu{
    String name = "FU";
    String hobby = "喝茶";
}

class Zi extends Fu{
    String name = "ZI";
    String game = "吃鸡";

    public void show(){
        //如何打印 ZI
        System.out.println(name);
        System.out.println(this.name);
        //如何打印 FU
        System.out.println(super.name);
        //如何打印喝茶
        System.out.println(hobby);
        System.out.println(this.hobby);
        System.out.println(super.hobby);
        //如何打印吃鸡
        System.out.println(game);
        System.out.println(this.game);
    }
}
