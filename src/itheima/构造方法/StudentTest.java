package itheima.构造方法;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用空参构造
        //报错的原因：
        //会调用 Student 的无参构造
        //Student s = new Student();

        Student student = new Student("张三",18);
        System.out.println(student.getName());
        System.out.println(student.getAge());

    }
}
