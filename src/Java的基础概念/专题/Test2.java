package Java的基础概念.专题;

public class Test2 {
    public static void main(String[] args) {
        //判断 101-200之间有多少个素数，并打印所有素数

        //思路一：2~9
        //定义变量 i，赋值为 100
        //判断 i是否为质数

        //定义一个变量用来统计有多少个质数
        int count = 0;
        //外循环：遍历 101-200这个范围，依次得到这个范围之内的每一个数字
        for (int i = 101; i <=200; i++) {
            //i 依次表示循环中每一个数字
            //继续判断 i 是否为质数
            boolean flag = true;
            //内循环：判断 i是否为质数
            for (int j = 2; j < i; j++) {
                //j 表示 2～99之间每一个数字
                if (i % j == 0){
                    flag = false;
                    //跳出单层循环，内循环
                    break;
                }
            }
            if (flag){
                System.out.println("当前数字"+i+"是质数");
                count++;
            }
        }
        System.out.println("101-200之间有"+count+"个质数");
        /*int i = 7;
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            //j 表示 2～99之间每一个数字
            if (i % j == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("当前数字是质数");
        }else {
            System.out.println("当前数字不是质数");
        }*/
    }
}
