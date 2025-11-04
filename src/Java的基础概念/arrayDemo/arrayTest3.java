package Java的基础概念.arrayDemo;

public class arrayTest3 {
    public static void main(String[] args) {
        /*
        * 定义一个数组，存储 1，2，3，4，5，6，7，8，9，10
        * 遍历数组得到每一个元素
        * 要求：
        * 1.如果是奇数，则将当前数字扩大两倍
        * 2.如果是偶数，则将当前数字变成二分之一
        * */

        //1.定义一个数组，存储 1，2，3，4，5，6，7，8，9，10
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历数据得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //i 表示数组里面每一个索引
            //arr[i] 表示数组里面每一个元素
            //3.对每一个元素进行判断
            if (arr[i] % 2 == 0){
                //如果是偶数，则将当前数字变成二分之一
                arr[i] = arr[i]/2;
            }else  {
                //如果是奇数，则将当前数字扩大两倍
            arr[i] = arr[i]*2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
