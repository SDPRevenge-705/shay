package oop.extensdemo.a06extensdemo6;
//就近原则
public class Test {
    public static void main(String[] args) {
        OverseasStudent stu = new OverseasStudent();
        stu.lunch();
    }
}

class Person{
    public void eat(){
        System.out.println("吃米饭，吃菜");
    }
    public void drink(){
        System.out.println("吃菜");
    }
}

//留学生
class OverseasStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }
    //应用场景：当父类中的方法，不能满足子类现在的需求时，我们就需要把这个方法进行重写
    //注意：子类中重写的方法上面需要加上@Override来表示这个是方法的重写
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
    public void drink(){
        System.out.println("喝凉水");
    }
}

class Student extends Person{
    public void lunch(){
        //先在本类中查看 eat 和 drink 的方法，就会调用子类的，如果没有就会调用从父类中继承下来的 eat 和 drink 方法
        this.eat();
        this.drink();

        //直接调用父类中的 eat 和 drink 方法
        super.drink();
        super.eat();
    }

}
