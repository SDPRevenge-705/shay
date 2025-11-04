package itheima.StringDemo;

public class StringDemo7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String stu = arrToString(arr);
        System.out.println(stu);

    }

    //1.我要干嘛？ 遍历数组并把数组拼接成一个字符串
    //2.我干这件事情需要什么才能完成？  数组
    //3.我干完这件事情需要返回结果？ 返回一个拼接之后的字符串
    //如果调用处需要继续使用，那么返回结果
    //如果调用处不需要继续使用，那么可以返回也可以不返回

    public static  String arrToString(int[] arr){
        if (arr == null){
            return "";
        }
        if (arr.length == 0){
            return "[]";
        }
        String result = "[";
        //当代码执行到这里表示什么？
        //表示数组不是 null，也不是长度为 0 的
        for (int i = 0; i < arr.length; i++) {
            //i索引  arr[i]元素
            if(i == arr.length -1){
                result = result + arr[i];
            }else {
                result = result + arr[i] +",";
            }
        }
        //此时拼接右括号
        result = result +"]";
        return result;
    }

}
