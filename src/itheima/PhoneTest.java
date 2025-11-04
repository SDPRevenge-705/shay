package itheima;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();
        //调用对象的行为
        p.brand = "小米";
        p.price = 2999.99;
        //获取手机对象中的值
        System.out.println("品牌：" + p.brand);
        System.out.println("价格：" + p.price);
        //调用手机中的方法即可
        p.call();
        p.playGame();


        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8999.99;
        System.out.println("品牌：" + p2.brand);
        System.out.println("价格：" + p2.price);
        p2.playGame();
        p2.call();
    }
}
