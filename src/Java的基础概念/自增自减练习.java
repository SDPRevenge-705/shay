package Java的基础概念;

public class 自增自减练习 {
    public static void main(String[] args) {
        int x=10;
        //后++：先用后+
        //先把x变量中的值拿出来用，赋值给y，然后再进行自增
        //赋值给y的值是自增前的
        int y=x++;
        //先++：先加后用
        //先把x进行自增，然后把自增后的结果赋值给左边的变量
        //赋值给z的值是自增后的
        int z=++x;
        System.out.println("x:"+x);//12
        System.out.println("y:"+y);//10
        System.out.println("z:"+z);//12
    }
}
