package top.extensdemo.TeacherTest;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer();
        l.setId("001");
        l.setName("张三");
        System.out.println("员工 ID为："+l.getId()+"，姓名为："+l.getName()+"，部门为："+l.getDivision()+"，职务为："+l.getZhiye());
        l.work();

        System.out.println("----------------------------------------");

        Tutor t = new Tutor();
        t.setId("002");
        t.setName("李四");
        System.out.println("员工 ID为："+t.getId()+"，姓名为："+t.getName()+"，部门为："+t.getDivision()+"，职务为："+t.getZhiye());
        t.work();

        System.out.println("----------------------------------------");

        Maintainer m = new Maintainer();
        m.setId("003");
        m.setName("王五");
        System.out.println("员工 ID为："+m.getId()+"，姓名为："+m.getName()+"，部门为："+m.getDivision()+"，职务为："+m.getZhiye());
        m.work();

        System.out.println("----------------------------------------");

        buyer b = new buyer();
        b.setId("004");
        b.setName("赵六");
        System.out.println("员工 ID为："+b.getId()+"，姓名为："+b.getName()+"，部门为："+b.getDivision()+"，职务为："+b.getZhiye());
        b.work();

    }
}
