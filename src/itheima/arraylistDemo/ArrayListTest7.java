package itheima.arraylistDemo;

import java.util.ArrayList;
/*需求:
1，main方法中定义一个集合，存入三个用户对象。
用户属性为:id，username，password
2，要求:定义一个方法，根据id查找对应的用户信息。
如果存在，返回对应的索引
如果不存在，返回-1*/
public class ArrayListTest7 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建三个用户对象
        User u1 = new User("1001","张三","123456");
        User u2 = new User("1002","李四","123456");
        User u3 = new User("1003","王五","123qwer");

        //3.添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.查找索引
        int index = getIndex(list,"1002");
        System.out.println(index);

    }
    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                //如果找到直接返回 true
                return i;
            }
        }
        return -1;
    }
}
