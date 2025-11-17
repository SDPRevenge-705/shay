package oop.extensdemo.TeacherTest;

public class Tutor extends Teacher{
    public Tutor(String id, String name, String division, String zhiye) {
        super(id, name, division, zhiye);
    }

    public Tutor() {
        this.setZhiye("助教");
    }

    @Override
    public void work() {
        System.out.println("助教正在辅导学生");
    }
}
