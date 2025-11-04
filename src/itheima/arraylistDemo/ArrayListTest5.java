package itheima.arraylistDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest5 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.键盘录入学生的信息并添加到集合当中
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student s= new Student();

            System.out.println("请输入学生的姓名");
            String nanme = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();

            //name 和 age 赋值给学生对象
            s.setName(nanme);
            s.setAge(age);
            //把学生对象添加到集合当中
            list.add(s);
        }

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("姓名：" + s.getName() + "，年龄：" + s.getAge());
        }

    }
}
