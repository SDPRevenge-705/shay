package top.extensdemo.TeacherTest;

public class Lecturer extends Teacher{

    public Lecturer(String id, String name, String division, String zhiye) {
        super(id, name, division, zhiye);
    }

    public Lecturer() {
        this.setZhiye("讲师");
    }

    @Override
    public void work() {
        System.out.println("讲师正在讲课");
    }
}
