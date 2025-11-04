package Java的基础概念;
//1.导包
import java.util.Scanner;

public class 键盘录入2 {
    public static void main(String[] args) {
        //2.创建对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字");
        //3.接受数据
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        //再次接受第二个数据
        int number2 = sc.nextInt();
        System.out.println(number1+number2);
    }
}
