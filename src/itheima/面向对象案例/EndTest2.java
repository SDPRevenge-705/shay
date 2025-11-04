package itheima.面向对象案例;

public class EndTest2 {
    public static void main(String[] args) {
        /*
        * 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。学生的属性:学号，姓名，年龄:
            要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
            要求2:添加完毕之后，遍历所有学生信息。

            要求3:通过id删除学生信息
            如果存在，则删除，如果不存在，则提示删除失败
            要求4:删除完毕之后，遍历所有学生信息。
            要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
* */
        //1.创建一个长度为 3 的数组
        Student[] arr = new Student[3];

        //2.创建学生对象
        Student st1 = new Student(1001,"张三",19);
        Student st2 = new Student(1002,"李四",20);
        Student st3 = new Student(1003,"王五",21);

        //3.把学生对象添加到数组当中
        arr[0] = st1;
        arr[1] = st2;
        arr[2] = st3;

        //4.再次创建一个学生对象
        Student st4 = new Student(1004,"赵六",22);

        //5.唯一性判断
        //5.1已经存在  --- 提示重复
        //5.2不存在 --- 添加学生对象
        boolean flag = onlyStudent(arr,st4.getId());
        if (flag){
            System.out.println("该学号已存在");
        }else {
            int count = getCount(arr);
            if (count < arr.length){
                arr[count] = st4;
                System.out.println(arr[count]);
            }else {
                Student[] newArr = new Student[arr.length+1];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                newArr[arr.length] = st4;
                arr = newArr;
                System.out.println("数组已满，已扩容并添加学生");
            }
        }
        System.out.println("添加学生后数组中的元素为:");
        prinatStudent(arr);



        //6.添加学生对象
        //6.1 老数组已经存满
        //6.2 老数组没有存满



    }

    public static void prinatStudent(Student[] arr){
        System.out.println("================");
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                System.out.println("学号: " + stu.getId() + ", 姓名: " + stu.getName() + ", 年龄: " + stu.getAge());
            }
        }
        System.out.println("================");
    }

    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }


    public static boolean onlyStudent(Student[] arr,int id){

        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                int sid = stu.getId();
                if (sid == id){
                    System.out.println("该学号已存在");
                    return true;
                }
            }
        }
        return false;
    }
}
