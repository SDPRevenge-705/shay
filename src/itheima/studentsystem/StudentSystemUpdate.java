package itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystemUpdate {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();
        loop:while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出系统");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> login(list);
                case "2" -> addControl(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    break loop;
                }
                default -> System.out.println("输入错误，请重新输入");
            }
        }


    }

    //登录
    public static void login(ArrayList<User> list) {
        System.out.println("登录");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入用户密码：");
        String password = sc.next();
        int index = getIndex(list,username);
        if (index == -1) {
            System.out.println("用户名不存在，请重新登录");
        }else {
            //表示用户名存在，判断密码是否正确
            User u = list.get(index);
            if (u.getPassword().equals(password)){
                System.out.println("登录成功");
            }else {
                System.out.println("密码错误，请重新登录");
            }
        }



    }

    //注册
    public static void addControl(ArrayList<User> list){
        //利用空参构造先创建用户对象
        User u = new User();

        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入用户id：");
            id = sc.next();
            boolean flag = contains(list,id);
            if (flag){
                //表示 id 已经存在，需要重新录入
                System.out.println("该 id 已存在，请重新输入");
                continue;
            }else {
                //表示 id 不存在，跳出循环
                u.setId(id);
                break;
            }
        }

        System.out.println("请输入用户姓名：");
        String userName = sc.next();
        u.setUserName(userName);

        String password1 = null;
        while (true) {
            System.out.println("请输入用户密码：");
            password1 = sc.next();
            System.out.println("请确认用户密码：");
            String password2 = sc.next();
            if (!password1.equals(password2)){
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            }
            break;
        }

        u.setPassword(password1);

        System.out.println("请输入手机号码：");
        String number = sc.next();
        u.setPhoneNumber(number);

        //将用户对象添加到集合中
        list.add(u);
        System.out.println("添加成功");

    }

    //忘记密码
    public static void forgetPassword(ArrayList<User> list){
        System.out.println("忘记密码");
        /*User u = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入忘记账号的手机号码");
        int number =sc.nextInt();
        int index = getIndex(list, String.valueOf(number));
        System.out.println("请输入新密码：");
        String newPassword = sc.next();
        u.setPassword(newPassword);
        System.out.println("密码重置成功");*/


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入忘记账号的手机号码");
        String number = sc.next();

        // 查找对应手机号码的用户索引
        int index = getIndexByPhoneNumber(list, number);

        if (index != -1) {
            System.out.println("请输入新密码：");
            String newPassword = sc.next();
            System.out.println("请确认新密码：");
            String confirmPassword = sc.next();

            if (newPassword.equals(confirmPassword)) {
                // 修改列表中对应用户的密码
                list.get(index).setPassword(newPassword);
                System.out.println("密码重置成功");
            } else {
                System.out.println("两次输入的密码不一致，密码重置失败");
            }
        } else {
            System.out.println("该手机号码不存在，请重新输入");
        }



    }

    //判断 id 在集合中是否存在
    public static boolean contains(ArrayList<User> list, String id){
        /*//循环遍历集合得到里面每一个用户对象
        for (int i = 0; i < list.size(); i++) {
            //拿到用户对象后，获取 Id 并进行判断
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                //存在，true   不存在 false
                return true;
            }
        }
        return false;*/

        //调用 getIndex 方法，判断返回值是否大于等于 0
        return getIndex(list,id) >= 0;
    }

    //通过 id 获取索引的方法
    public static int getIndex(ArrayList<User> list, String id){
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //得到每一个用户对象
            User u = list.get(i);
            //获取用户对象的 id
            String uid = u.getId();
            //拿着集合中的用户 id 跟要查询的 id 进行比较
            if (uid.equals(id)){
                //表示 id 存在，返回当前索引
                return i;
            }
        }
        //如果循环结束，都没有找到，返回 -1
        return -1;
    }

    // 添加一个通过手机号码获取索引的方法
    public static int getIndexByPhoneNumber(ArrayList<User> list, String phoneNumber) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getPhoneNumber().equals(String.valueOf(phoneNumber))) {
                return i;
            }
        }
        return -1;
    }

}
