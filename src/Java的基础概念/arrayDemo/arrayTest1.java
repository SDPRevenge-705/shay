package Java的基础概念.arrayDemo;

public class arrayTest1 {
    public static void main(String[] args) {
        //定义一个数组并添加数据
        int[] arr = {1,2,3,4,5};

        //求和变量
        int sum = 0;

        //2.遍历数组得到每一个数据，累加求和
        for (int i = 0; i < arr.length; i++) {
            //i依次表示数组里面的每一个索引
            //arr[i]依次表示数组里面的每一个元素
            sum  = sum + arr[i];
        }
        //当循环结束之后，打印出来的 sum 就是累加的结果
        System.out.println(sum);
    }
}
