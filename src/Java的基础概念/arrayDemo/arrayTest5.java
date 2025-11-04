package Java的基础概念.arrayDemo;

import java.util.Random;

public class arrayTest5 {
    public static void main(String[] args) {
        /*
        * 需求：生成 10个 1～100之间的随机数存入数组
        * 1.求出所有数据的和
        * 2.求所有数据的平均数
        * 3.统计有多少个数据比平均数小
        * */

        //1.定义数组
        //动态
        int[] arr=new int[10];
        //2.把随机数存入到数组当中
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            //每循环一次，就会生成一个新的随机数
            int number = r.nextInt(100)+1;
            //把生成的随机数添加到数组当中
            //数组名[索引]=变量名
            arr[i]=number;
        }

        //求出所有数据的和
        //定义求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //循环得到每一个元素
            //并把元素类加到 sum 当中
            sum = sum + arr[i];
        }
        System.out.println("所有数据的和为："+sum);

        //求所有数据的平均数
        int avg = sum/arr.length;
        System.out.println("所有数据的平均数为："+avg);

        //统计有多少个数据比平均数小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        //当循环结束之后，就表示我已经找到了比所以数据都小的个数
        System.out.println("比平均数小的个数为："+count);
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
