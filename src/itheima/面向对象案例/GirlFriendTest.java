package itheima.面向对象案例;

public class GirlFriendTest {
    public static void main(String[] args) {
        //1.定义数组存入女朋友的对象
        GirlFriend[] arr = new GirlFriend[4];

        //2.创建女朋友对象
        GirlFriend gf1 = new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹",19,"萌妹子","聊天");
        GirlFriend gf3 = new GirlFriend("小绿绿",20,"萌妹子","玩游戏");
        GirlFriend gf4 = new GirlFriend(" 小慧慧",21,"萌妹子","看书学习");

        //3.将女朋友对象存入数组
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //4.求和
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            //i索引  arr[i]元素（女朋友对象）
            GirlFriend gf = arr[i];
            //累加
            sum = sum + gf.getAge();
        }

        //5.求平均
        int avg = sum / arr.length;
        System.out.println("平均年龄为：" + avg);

        //6.统计年龄比平均值低的有几个，打印信息
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println(gf.getName() + "，" +gf.getAge() + "，" +gf.getHobby());
            }
        }
        System.out.println(count+"个");
    }
}
