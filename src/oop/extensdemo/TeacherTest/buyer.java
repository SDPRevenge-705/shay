package oop.extensdemo.TeacherTest;

public class buyer extends AdminStaff{

    public buyer() {
        this.setZhiye("采购专员");
    }
    public buyer(String id, String name, String division, String zhiye) {
        super(id, name, division, zhiye);
    }

    @Override
    public void work() {
        System.out.println("采购正在购买商品");
    }
}
