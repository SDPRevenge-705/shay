package itheima.stringtest;

public class Test5 {
    public static void main(String[] args) {
        /*
        * 注意:需要用己有的知识完成。
            给定两个以字符串形式表示的非负整数num1和num2，
            返回num1和num2的乘积，
            它们的乘积也表示为字符串形式。*/

        //不需要考虑乘积过大之后的结果
        //就认为乘积一定是小于 int 的最大值的

        String num1 = "20";
        String num2 = "30";

        //1.把 num 1和 num2变成对应的整数才可以
        //先遍历字符串依次得到每一个字符'1'、'2'、'3'
        //再把字符'1'、'2'、'3'变成整数 1、2、3
        //最后再把 123 这个整数保存下来

        int n1 = 0;
        for (int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            int i1 = c - '0';
            n1 = n1 * 10 + i1;
        }

        int n2 = 0;
        for (int i = 0; i < num2.length(); i++) {
            char c = num2.charAt(i);
            int i2 = c - '0';
            n2 = n2 * 10 + i2;
        }


        //2.利用整数进行相乘
        int product = n1 * n2;

        //3.可以把整数变成字符串
        String productStr = product + "";
        System.out.println(productStr);
    }
}
