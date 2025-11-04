package itheima.StringDemo;

public class StringDemo8 {
    public static void main(String[] args) {
       String result = reverse("abc");
       System.out.println(result);
    }

    //1.我要干嘛？  字符串的反转
    //2.我干这件事情需要什么才能完成？   需要一个字符串
    //3.需不需要返回结果?     需要返回
    public static String reverse(String str){
        //abc
        String result ="";
        for (int i = str.length() -1; i >= 0; i--) {
            //i依次表示字符串中的每一个索引（倒着的）
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
