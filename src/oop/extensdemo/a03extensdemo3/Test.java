package oop.extensdemo.a03extensdemo3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();

        //把对象的地址值 z 以 16 进制的形式打印出来
        //System.out.println(Long.toHexString(VM.currentThread().addressOf(z)));

        //因为内存分析工具需要程序不停止
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}

class Fu{
    private int a = 0x111;
    int b = 0x222;

    public void fuShow1(){
        System.out.println("父类的方法1");
    }

    private void fuShow2(){
        System.out.println("父类的方法2");
    }
}

class Zi extends Fu{
    int c = 0x333;

    public void  ziShow(){
        System.out.println("子类的方法");
    }
}