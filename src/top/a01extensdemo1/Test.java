package top.a01extensdemo1;

public class Test {
    public static void main(String[] args) {
        /*现在有四种动物:布偶猫、中国狸花猫、哈士奇、泰迪
        暂时不考虑属性，只要考虑行为。
        请按照继承的思想特点进行继承体系的设计，
        四种动物分别有以下的行为
            布偶猫:吃饭、喝水、抓老鼠
            中国狸花猫:吃饭、喝水、抓老鼠
            哈士奇:吃饭、喝水、看家、拆家
            泰迪:吃饭、喝水、看家、蹭一蹭*/
        //创建对象并调用方法

        //1.创建布偶猫的对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("------------------");

        //2.创建哈士奇的对象
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();


    }
}
