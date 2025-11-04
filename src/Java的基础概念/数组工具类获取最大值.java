package Java的基础概念;

public class 数组工具类获取最大值 {
    public static int getMax(int[] arr) {
        int max=arr[0];
        for (int i=0;i<=max;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
