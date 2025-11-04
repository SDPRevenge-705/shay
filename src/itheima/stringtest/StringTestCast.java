package itheima.stringtest;

import java.util.Scanner;

public class StringTestCast {
    public static void main(String[] args) {
        /*键盘录入一个字符串
        要求1:长度为小于等于9
        要求2:只能是数字
                将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系
        1-1、11-2、11-3、IV-4、V-5、V-6、-7、-8、1X-9注意点:
        罗马数字里面是没有0的(长度为0的字符串)如果键盘录入的数字包含0，可以变成””*/

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();
            //2.判断 校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入的字符串不符合规则,请重新输入");
                continue;
            }
        }

        /*将内容变成罗马数字
                下面是阿拉伯数字跟罗马数字的对比关系
                Ⅰ-1、ⅠⅠ-2、ⅠⅠⅠ-3、IV-4、V-5、V-6、VI-7、VII-8、IX-9
                罗马数字里面是没有0的(长度为0的字符串)如果键盘录入的数字包含0，可以变成””*/
        //可以用查表法:数字跟数据产生一个关系
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;// 1 2 3 4 5
            String s = changeLuoMa(number);
            sb.append(s);
        }
        System.out.println(sb);




    }

    public static String changeLuoMa(int number){
        //定义一个数组，让索引跟罗马数组产生一个对应的关系
        String[] arr = {"","Ⅰ","ⅠⅠ","ⅠⅠⅠ","IV","V","VⅠ","VⅠⅠ","IX"};
        //2.根据number返回对应的罗马数字
        return arr[number];
    }

    public static boolean checkStr(String str){
        //要求1:长度为小于等于9
        if (str.length() > 9) {
            return false;
        }

        //要求2:只能是数字
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);//0~9
            if (c < '0' || c > '9') {
                return false;
            }
        }

        //只有当字符串里面所有的字符全都判断完毕了，我才能认为当前的字符串是符合规则
        return true;
    }
}
