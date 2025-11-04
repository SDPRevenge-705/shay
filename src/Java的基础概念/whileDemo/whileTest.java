package Java的基础概念.whileDemo;

public class whileTest {
    public static void main(String[] args) {
        //需求：珠穆朗玛峰（8844430米=884443000毫米）假如我有一张足够大的纸，
        //它的厚度是 0.1毫米。
        //请问，我折叠多少次，可以折成珠穆朗玛峰的高度？

        //double a=0.1;
        //a = a* 2;
        //a *=2

        //1.定义一个变量用来记录山峰的高度
        double height = 8844430;
        //2.定义一个变量用来记录纸张的初始厚度
        double paper = 0.1;
        //3.定义一个变量用来记录折叠次数
        int count = 0;
        //4.循环折叠纸张，只要纸张的厚度小于山峰的高度，那么循环就继续
        //每折叠一次，统计次数就要++
        //选择 while 理由：此时我们不知道循环的次数也不知道循环的范围，只知道循环结束条件，所以用 while
        while(paper < height){
            //折叠纸张
            paper = paper *2;
            //折叠一次，++一次
            count++;
        }
        //当循环结束之后，count 记录的值结束折叠的次数
        System.out.println(count);
    }
}
