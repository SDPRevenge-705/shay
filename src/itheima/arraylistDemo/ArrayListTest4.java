package itheima.arraylistDemo;

import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.创建学生对象
        Student s1 =new Student("张三",23);
        Student s2 =new Student("李四",24);
        Student s3 =new Student("王五",25);

        //3.添加学生对象到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.遍历集合
        for(int i=0;i<list.size();i++){
            //i:索引
            //list.get(i):根据索引获取元素
            //Student stu:接收根据索引获取的元素
            Student stu = list.get(i);
            System.out.println(stu);
        }

    }
}
