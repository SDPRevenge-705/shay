package Java的基础概念.arrayDemo;

public class arrayDemo5 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr1 = {1,2,3,4,5};
        //长度 ：5
        //最小索引：0
        //最大索引：4（数组的长度-1）
        //System.out.println(arr1[10]);
        System.out.println(arr1[0]);
        //索引越界异常
        //原因：访问了不存在的索引
        //避免：索引的范围
      /*  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
        at Java的基础概念.arrayDemo.arrayDemo5.main(arrayDemo5.java:10)*/
    }
}
