package itheima;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf1 =new GirlFriend();
        //赋值
        gf1.setName("小诗诗");
        gf1.setAge(18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());


        //调用行为
        gf1.sleep();
        gf1.eat();

    }
}
