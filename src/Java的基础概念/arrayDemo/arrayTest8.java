package Java的基础概念.arrayDemo;

public class arrayTest8 {
    public static void main(String[] args) {
        //需求：定义一个数组，存入 1，2，3，4，5，交换收尾索引对应的元素
        //交换前：1 2 3 4 5
        //交换后：5 4 3 2 1

        //1.定义一个数组
        int[] arr = {1,2,3,4,5};
        //2.利用循环交换数据
        for (int i=0,j=arr.length-1;i<j;i++,j--) {
            //交换变量 i 和变量 j 指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //当循环结束之后，那么数组中的数据就实现了头尾交换
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
