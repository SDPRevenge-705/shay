package Java的基础概念.arrayDemo;

public class arrayTest4 {
    public static void main(String[] args) {
        //定义数组求最大值：33,5,22,44,55

        //扩展问题：根据求最大值的思路，自己改写一下求最小值
        //为什么 amx 要记录 arr【0】，默认值不能为 0 吗？
        //不能写 0
        //max的初始化值一定要是数组中的值
        //循环中开始条件一定是 0 吗？
        //循环的开始条件如果为 0，那么第一次循环的时候是自己跟自己比了一下，对结果没有任何影响，但是效率会低一点
        //为了提高效率，减少一次循环的次数，循环开始条件可以写 1

        //1.定义数组用来存储 5 个值
        int[] arr = {33,5,22,44,55};
        //2.定义一个变量用来存储最大值
        int max=arr[0];
        int min=arr[0];
        //临时认为 0 索引上最大的
        //3.循环获取数组每一个元素
        //拿着每一个元素跟 max 进行比较
        for (int i = 0; i < arr.length; i++) {
            //i 表示数组的每一个索引
            //arr[i] 表示数组的每一个元素
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        //4.当循环结束之后，max 记录的结束数组中的最大值
        System.out.println(max);
        //5.当循环结束之后，min 记录的结束数组中的最小值
        System.out.println(min);
    }
}
