package itheima.studentcontrol;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentControl {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true) {
            System.out.println("------------------欢迎来到学生管理系统------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3.修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出系统");
            System.out.println("请选择您要进行的操作：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose){
                case "1"-> addStudent(list);
                case "2"-> deleteStudent(list);
                case "3"-> updateStudent(list);
                case "4"-> queryStudent(list);
                case "5"-> exitSystem();//break loop;
                default -> System.out.println("没有这个选项");
            }
        }

    }
    //添加学生
    public static void addStudent(ArrayList<Student> list){
        //利用空参构造先创建学生对象
        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生id：");
            id = sc.next();
            boolean flag = contains(list,id);
            if (flag){
                //表示 id 已经存在，需要重新录入
                System.out.println("该 id 已存在，请重新输入");
                continue;
            }else {
                //表示 id 不存在，跳出循环
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生地址：");
        String address = sc.next();
        s.setAddress(address);

        //将学生对象添加到集合中
        list.add(s);
        System.out.println("添加成功");


    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生 id：");
        String id = sc.next();
        //查询 id 在集合中的索引
        int index = getIndex(list,id);
        //对 index 进行判断
        //如果大于等于 0 的就表示存在，直接删除
        //如果表示-1，就表示不存在，结束方法，回到初始菜单
        if (index >= 0){
            //如果大于等于 0 的，表示存在，直接删除
            list.remove(index);
            System.out.println("id 为："+id+"的学生删除成功");
        }else {
            System.out.println("该 id 不存在,删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的 id");
        String id = sc.next();
        int index = getIndex(list,id);
        if (index == -1){
            System.out.println("该 id 不存在,修改失败");
            return;
        }

        //当代码执行到这里，表示 id 是存在的
        //获取要修改的学生对象
        Student stu = list.get(index);

        //输入其他的信息并修改
        System.out.println("请输入要修改的学生姓名：");
        String newname = sc.next();
        stu.setName(newname);

        System.out.println("请输入要修改的学生年龄：");
        int newage = sc.nextInt();
        stu.setAge(newage);

        System.out.println("请输入要修改的学生地址：");
        String newaddress = sc.next();
        stu.setAddress(newaddress);

        System.out.println("修改成功");


    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("查询学生");
        if(list.size() == 0){
            System.out.println("当前无学生信息");
            //结束方法
            return;
        }

        //打印表头信息
        System.out.println("id\t姓名\t年龄\t地址");
        //当代码执行到这里，表示集合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
        }
    }

    //退出系统
    public static void exitSystem(){
        System.out.println("退出系统");
        System.exit(0);//停止虚拟机运行
    }

    //判断 id 在集合中是否存在
    public static boolean contains(ArrayList<Student> list,String id){
        //循环遍历集合得到里面每一个学生对象
        /*for (int i = 0; i < list.size(); i++) {
            //拿到学生对象后，获取 Id 并进行判断
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)){
                //存在，true   不存在 false
                return true;
            }
        }
        return false;*/

        //调用 getIndex 方法，判断返回值是否大于等于 0
        return getIndex(list,id) >= 0;
    }

    //通过 id 获取索引的方法
    public static int getIndex(ArrayList<Student> list,String id){
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //得到每一个学生对象
            Student stu = list.get(i);
            //获取学生对象的 id
            String sid = stu.getId();
            //拿着集合中的学生 id 跟要查询的 id 进行比较
            if (sid.equals(id)){
                //表示 id 存在，返回当前索引
                return i;
            }
        }
        //如果循环结束，都没有找到，返回 -1
        return -1;
    }
}
