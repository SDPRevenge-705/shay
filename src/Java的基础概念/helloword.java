package Java的基础概念;

public class helloword {
    public static void main(String[] args) {
        //打印hello and welcome
        System.out.printf("Hello and welcome!");
        //打印数组最大值
        int[] arr={10,20,50,70,200,30};
        int max=arr[0];
        for (int i = 1; i <=5; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
