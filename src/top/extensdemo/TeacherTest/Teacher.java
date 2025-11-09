package top.extensdemo.TeacherTest;

public class Teacher extends Employee {
    public Teacher(String id, String name, String division, String zhiye) {
        super(id, name, division, zhiye);
    }

    public Teacher() {
        this.setDivision("教研部");
    }
}
