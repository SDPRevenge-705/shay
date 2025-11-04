package Java的基础概念.arrayDemo;

public class arrayTest2 {
    public static void main(String[] args) {
        //需求：定义一个数组，存储 1，2，3，4，5，6，7，8，9，10
        //遍历数组得到每一个元素，统计数组里面一共有多少个能被 3 整除的元素

        //1.定义一个数组 存储数据
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //定义一个变量统计次数
        int count = 0;
        //2.遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //i 表示数组里面每一个索引
            //arr[i] 表示数组里面每一个元素
            //3.判断当前的元素是否为 3 的倍数，如果是你们统计变量就需要自增一次
            if(arr[i]% 3 == 0){
                //System.out.println(arr[i]);
                count++;
            }
        }
        //当循环结束之后，就表示数组里面所以的数字都判断完毕了，直接打印 count 即可
        System.out.println("数组里面能被 3 整除的元素有："+count+"个");
    }
}
