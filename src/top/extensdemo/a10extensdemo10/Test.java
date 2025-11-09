package top.extensdemo.a10extensdemo10;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("1001", "张三", 5000, 1000);
        System.out.println(m.getId() + " " + m.getName() + " " + m.getSalary() + " " + m.getBouns());
        m.work();
        m.eat();

        System.out.println("=====================");

        Cook c =  new Cook();
        c.setId("1002");
        c.setName("李四");
        c.setSalary(3000);
        System.out.println(c.getId() + " " + c.getName() + " " + c.getSalary());
        c.work();
        c.eat();


    }
}
