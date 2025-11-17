package oop.extensdemo.TeacherTest;

public class Maintainer extends AdminStaff{
    public Maintainer(String id, String name, String division, String zhiye) {
        super(id, name, division, zhiye);
    }

    public Maintainer() {
        this.setZhiye("维护专员");
    }

    @Override
    public void work() {
        System.out.println("管理员正在维护系统");
    }
}
