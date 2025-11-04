package Java的基础概念.arrayDemo;

public class arrayDemo1 {
    public static void main(String[] args) {
        //格式：
        //静态初始化
        //完整格式：
        //数据类型【】数组名 = new 数据类型【】{元素1，元素2，元素3，...};
        //简化格式
        //数据类型【】数组名 = {元素1，元素2，元素3，...};

        //需求 1：定义数组存储 5 个学生的年龄
        int[] arr1=new int[]{11,12,13,14,15};
        int[] arr2={11,12,13,14,15};
        //需求 2：定义数组存储 3 个学生的姓名
        String[] arr3=new String[]{"张三","李四"};
        String[] arr4={"张三","李四","王五"};
        //需求 3：定义数组存储 4 个学生的身高
        double[] arr5=new double[]{1.78,1.80,1.82,1.85};
        double[] arr6={1.78,1.80,1.82,1.85};

        System.out.println(arr6);//[D@6acbcfc0
        //扩展：
        //解释一下地址值的格式含义
        //[D@6acbcfc0
        //[ 表示数组
        //D 表示数组元素的数据类型为 double
        //@ 分隔符
        //6acbcfc0 十六进制的内存地址值


    }
}
