package Java的基础概念;

public class 基本数据类型变量 {
    public static void main(String[] args) {
        //byte
        //-128~127取值范围
        byte b = 10;
        System.out.println(b);
        //short
        short s = 20;
        System.out.println(s);
        //int
        int i = 30;
        System.out.println(i);
        //long
        //如果要定义long类型的变量
        //在数据值后面需要加上一个L作为后缀
        //大小写都可以
        //建议：使用大写
        long n = 99999999L;
        System.out.println(n);

        //float
        //注意点：定义float类型变量的时候
        //数据值也需要加一个F作为后缀
        float f = 10.1F;
        System.out.println(f);

        //double
        double d=20.2;
        System.out.println(d);

        //char
        char c ='中';
        System.out.println(c);

        //boolean
        boolean bo=true;
        System.out.println(bo);

    }
}
