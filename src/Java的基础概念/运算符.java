package Java的基础概念;

public class 运算符 {
    public static void main(String[] args) {
        //+
        System.out.println(3+4);
        //-
        System.out.println(3-4);
        //*
        System.out.println(3*4);

        //如果在计算的时候有小数参与
        //结论：在代码中，如果有小数参与计算，结果有可能是不正确的
        //暂时只要知道这个结论即可
        //具体原因要到javase的时候才会讲解
        System.out.println(1.1-1.01);
        System.out.println(1.1+1.01);


    }
}
