package Java的基础概念.fordemo;

public class forTest {
    public static void main(String[] args) {
        //需要1:打印1-5
        //开始条件：1
        //结束条件：5
        for(int i=1;i<=5;i++){
            //第一次循环：i=1
            //第二次循环：i=2
            //第三次循环：i=3
            //第四次循环：i=4
            //第五次循环：i=5
            System.out.println(i);
        }
        //需求2:打印5-1
        //开始条件：5
        //结束条件：1
        for(int i=5;i>=1;i--){
            //第一次循环：i=5
            //第二次循环：i=4
            //第三次循环：i=3
            //第四次循环：i=2
            //第五次循环：i=1
            System.out.println(i);
        }
    }
}
