package oop.polymorphism.a04demo4;

public class Person {
    /*3.定义Person类//饲养员
		属性：
			姓名，年龄
		行为：
			keepPet(Dog dog,String something)方法
				功能：喂养宠物狗，something表示喂养的东西
		行为：
			keepPet(Cat cat,String something)方法
				功能：喂养宠物猫，something表示喂养的东西
		生成空参有参构造，set和get方法
	4.定义测试类(完成以下打印效果):
		keepPet(Dog dog,String somethind)方法打印内容如下：
			年龄为30岁的老王养了一只黑颜色的2岁的狗
			2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
		keepPet(Cat cat,String somethind)方法打印内容如下：
			年龄为25岁的老李养了一只灰颜色的3岁的猫
			3岁的灰颜色的猫眯着眼睛侧着头吃鱼*/

    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

    /*keepPet(Dog dog,String somethind)方法打印内容如下：
    年龄为30岁的老王养了一只黑颜色的2岁的狗
			2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
    keepPet(Cat cat,String somethind)方法打印内容如下：
    年龄为25岁的老李养了一只灰颜色的3岁的猫
			3岁的灰颜色的猫眯着眼睛侧着头吃鱼*/

/*    //饲养狗
    public void keepPet(Dog dog,String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
        dog.eat(something);
    }


    //饲养猫
    public void keepPet(Cat cat,String something){
        System.out.println("年龄为"+age+"岁的"+name+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
        cat.eat(something);
    }*/

    //想要一个方法，能接受所有的动物，包括猫，包括狗
    //方法的形参：可以写这些类的父类 Anial
    public void keepPet(Animal a,String something) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的狗");
            d.eat(something);
        }else if (a instanceof Cat c) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的猫");
            c.eat(something);
        }else {
            System.out.println("没有这种动物");
        }

    }
}

