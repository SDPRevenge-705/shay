package top.extensdemo.a10extensdemo10;

public class Cook extends Emloyee{
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
