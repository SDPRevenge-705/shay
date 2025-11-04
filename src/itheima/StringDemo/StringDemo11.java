package itheima.StringDemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //1.定义一个字符串记录身份证号码
        String id = "44032419900101001X";

        //2.截取出生年月
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);

        System.out.println("人物信息为：");
        System.out.println("出生年月为："+year + "年" + month + "月" + day + "日");
        //3.获取性别
        char gender = id.charAt(16);//'1'
        //利用 ASCII 码表进行转换
        //'0'-----> 48
        //'1'-----> 49

        int num = gender - 48;
        if (num % 2 == 0 ){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }


    }
}
