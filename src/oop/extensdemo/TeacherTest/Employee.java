package oop.extensdemo.TeacherTest;

public class Employee {
    private String id;
    private String name;
    private String division;
    private String zhiye;

    public Employee() {
    }

    public Employee(String id, String name, String division) {
        this.id = id;
        this.name = name;
        this.division = division;
    }

    public Employee(String id, String name, String division, String zhiye) {
        this.id = id;
        this.name = name;
        this.division = division;
        this.zhiye = zhiye;
    }


    public void work(){
        System.out.println("员工正在工作");
    }


    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return division
     */
    public String getDivision() {
        return division;
    }

    /**
     * 设置
     * @param division
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * 获取
     * @return zhiye
     */
    public String getZhiye() {
        return zhiye;
    }

    /**
     * 设置
     * @param zhiye
     */
    public void setZhiye(String zhiye) {
        this.zhiye = zhiye;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", division = " + division + ", zhiye = " + zhiye + "}";
    }
}
