package Java的基础概念.methoddemo;

public class methodTest6 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,22,3,44,89};
        //2.调用方法求最大值
        int max = getMax(arr);
        //3.打印最大值
        System.out.println(max);
    }
    //求最大值
    //数组
    //返回
    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
