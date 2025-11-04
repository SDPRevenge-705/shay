package Java的基础概念.skipLoopp;

public class skipLoppTest {
    public static void main(String[] args) {
        //1～100之间的满足逢七必过规则

        //个位 7 十位 7  7倍数
        //1 2 3 4 5 6 过 8 9 10

        //1.得到 1～100之间的每个数字
        //开始：1
        //结束：100
        for (int i = 1; i <= 100; i++) {
            //2.判断每一个数字，如果符合规则，就打印过，如果不符合规则就打印真实的数字
                if (i % 10 ==7 || i / 10 % 10 == 7 || i % 7 == 0){
                    System.out.println("过");
                    continue;
                }
            System.out.println(i);
        }
    }
}
