package oop.extensdemo.TeacherTest;

public class AdminStaff extends Employee {
    public AdminStaff(String id, String name, String division, String zhiye) {
        super(id, name, division, zhiye);
    }

    public AdminStaff() {
        this.setDivision("行政部");
    }
}
