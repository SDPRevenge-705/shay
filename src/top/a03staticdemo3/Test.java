package top.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //1.创建一个集合用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //2.创建 3 个学生对象
        Student stu1 = new Student("张三",23,"男");
        Student stu3 = new Student("李四",24,"男");
        Student stu2 = new Student("王五",23,"女");

        //3.将 3 个学生对象添加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //4.调用工具类中的方法 getMaxAgeStudent  传递 list 集合
        int maxAge = StudentUtil.getMaxAgeStudent(list);
        System.out.println("最大年龄是：" + maxAge);


    }
}
