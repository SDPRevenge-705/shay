package Java的基础概念.methoddemo;

public class methodTest7 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,5,6,8,123};

        //2.判断一个数字在数组中是否存在
        boolean flag=contains(arr,123);
        System.out.println(flag);
    }
    //1.我要干嘛？判断一个数字在数组中是否存在
    //2.我需要什么？数字，数组
    //3.调用处是否需要继续使用结果？返回 true false
    public static boolean contains(int[] arr,int number){//查 89是否存在

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        //什么时候才能断定 89在数字中是不存在的？
        //当数组里面所有的数据全部比较完毕后，才能确定
        return false;
    }
}


//return break关键字的区别
//return：其实跟循环没有什么关系，跟方法有关的，表示 1 结束方法 2返回结果
//        如果方法执行到了 return，那么整个方法全部结束，里面的循环也会随着结束

//break关键字
//break：表示结束循环，继续执行循环后面的代码
//其实跟方法没有什么关系，结束循环或者 switch 的
