package oop.extensdemo.a09extensdemo9;

public class Student {
    String name;
    int age;
    String school;

    //默认为传至大学
    public Student() {
        //表示调用本类其他构造方法
        //细节：虚拟机就不会再添加 super（）
        this(null,0,"传至大学");
        System.out.println("默认传至大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
