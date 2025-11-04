package Java的基础概念.fordemo;

public class forTest3 {
    public static void main(String[] args) {
        //求1-5的和
        //1.循环1～5得到里面的每一个数字
        //开始条件：1
        //结束条件：5

        //用来进行累加的
        int sum = 0;
        for(int i=1;i<=5;i++){
            //求和的变量不能定义在循环里面，因为变量只在所属的大括号中有效
            //如果我们把变量定义在循环里面，那么当前变量只能在本次循环中有效
            //当本次循环结束之后，变量就会从内存中消失
            //第二次循环开始的时候，又会重新定义一个新的变量
            //结论：如果以后我们要写累加求和的变量，可以把变量定义在循环的外面
            //int sum = 0;
            //System.out.println(i);
            //可以把得到的每一个数字累加到变量sum当中
            sum =sum +i; //sum +=i;

        }
        //当循环结束后，表示已经把1-5累加到变量sum当中了
        System.out.println(sum);
    }
}

