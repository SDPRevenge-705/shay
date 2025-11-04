package itheima.arraylistDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        /*
        * boolean add(E e)          添加
        *
        * boolean remove(E e)        删除
        * E  remove(int index)
        *
        * E set(int index, E e)        修改
        *
        * E get(int index)             查询
        * int size()                  获取长度
        * */

        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println(list);

        //3.删除元素
        //list.remove("world");
        list.remove(1);
        System.out.println(list);

        //4.修改元素
        list.set(0,"helld");
        System.out.println(list);

        //5.查询元素
        String s = list.get(0);
        System.out.println(s);

        //6.获取长度
        for (int i = 0; i < list.size(); i++) {
            //i索引
            //list.get(i)
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
