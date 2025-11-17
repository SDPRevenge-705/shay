package oop.staticdemo.a04staticdemo4;

/*
* 总结
* 1.静态方法中只能访问静态成员
* 2.非静态方法中可以访问静态成员也可以访问非静态成员
* 3.静态方法中不能使用 this 关键字
* 4.非静态方法中可以使用 this 关键字
* */
public class Student {
    String name;
    int age;
    static String teacherName;

    //this:表示当前方法调用者的地址值
    //这个 this：是由虚拟机赋值的
    public void show1() {
        System.out.println("show1方法调用者的地址值：" + this);
        System.out.println("姓名：" + name + " 年龄：" + age + " 老师姓名：" + teacherName);

        //调用其他方法
        this.show2();
    }

    public void show2() {
        System.out.println("show2");
    }

    public static void method(){
        System.out.println("静态方法");
    }
}
