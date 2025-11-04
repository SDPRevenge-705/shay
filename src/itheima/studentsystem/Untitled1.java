package itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Untitled1 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();
        Scanner sc = new Scanner(System.in); // 在main方法中创建一次
        
        loop:while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出系统");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list, sc); // 传递Scanner对象
                case "2" -> addControl(list, sc); // 传递Scanner对象
                case "3" -> forgetPassword(list, sc); // 传递Scanner对象
                case "4" -> {
                    System.out.println("感谢使用，再见！");
                    break loop;
                }
                default -> System.out.println("输入错误，请重新输入");
            }
        }
        
        sc.close(); // 程序结束时关闭Scanner
    }

    // 登录方法实现
    public static void login(ArrayList<User> list, Scanner sc) {
        System.out.println("登录");
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入用户密码：");
        String password = sc.next();
        // 这里应该根据实际情况实现登录逻辑
        System.out.println("登录方法实现");
    }

    // 注册方法实现
    public static void addControl(ArrayList<User> list, Scanner sc) {
        System.out.println("注册");
        // 这里应该根据实际情况实现注册逻辑
        System.out.println("注册方法实现");
    }

    // 忘记密码方法实现
    public static void forgetPassword(ArrayList<User> list, Scanner sc) {
        System.out.println("忘记密码");
        // 这里应该根据实际情况实现忘记密码逻辑
        System.out.println("忘记密码方法实现");
    }
}