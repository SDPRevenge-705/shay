package top.extensdemo.a07extensdemo7;

public class DogTest {
    public static void main(String[] args) {
        HaShiQi h =  new HaShiQi();
        System.out.println("哈士奇");
        h.eat();
        h.drink();
        h.lookHome();
        h.bark();


        ShaPiDog s = new ShaPiDog();
        System.out.println("沙皮狗");
        s.eat();
        s.drink();
        s.lookHome();

        ChineseDog c = new ChineseDog();
        System.out.println("中华田园犬");
        c.eat();
        c.drink();
        c.lookHome();
    }
}
