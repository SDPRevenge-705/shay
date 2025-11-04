package Java的基础概念.专题;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*需求:
        一个大V直播抽奖，奖品是现金红包，分别有{2，588，888，1000，10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下:(随机顺序，不一定是下面的顺序)
        888元的奖金被抽出
        588元的奖金被抽出
        10000元的奖金被抽出
        1000元的奖金被抽出
        2元的奖金被抽出*/

        //1.定义数组表示奖池
        int[] arr = {2,588,888,1000,10000};
        //2.定义新数组用于存储抽奖的结果
        int[] newArr =new int[arr.length];
        //3.抽奖
        Random random = new Random();
        //因为有 5 个奖项，索引这里要循环 5 次
        for (int i = 0; i < 5; ) {
            //获取随机索引
            int randomInx = random.nextInt(arr.length);
            //获取奖项
            int prize =arr[randomInx];
            //判断当前的奖项是否存在,如果存在则重新抽取，如果不存在，就表示是有效奖项
            boolean flag = contians(newArr,prize);
            if (!flag) {
                //把当前抽取到的奖项添加到 newArr 当中
                newArr[i] = prize;
                //添加完毕之后，移动索引
                i++;
            }
        }
        //4.遍历 newArr 打印结果
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + "元的奖金被抽出");
        }
    }

    public static boolean contians(int[] arr,int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
