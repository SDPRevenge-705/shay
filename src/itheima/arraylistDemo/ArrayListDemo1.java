package itheima.arraylistDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型：指定集合中存储元素的类型
        //ArrayList<String> list = new ArrayList<String>();
        //jkd7:

        //此时我们创建的是 array list 的形象，而 ArrayList 是 java 已经写好的一个类
        //这个类在底层做了一些处理
        //打印对象不是地址值，而且集合中存储的数据内容
        //在展示的时候会拿【】把所有数据进行包裹
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);


    }
}
