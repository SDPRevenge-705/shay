package Java的基础概念.methoddemo;

public class methodTest8 {
    public static void main(String[] args) {
        //定义一个方法 copyOFRange(int[] arr,int from,int to)
        /*
        将数组 arr 中从索引 from（包含 from）开始
        到索引 to 结束（不包含to）的元素复制到新数组中
        将新数组返回
        * */

        //1.定义原始数组
        int[] arr = {1,2,3,4,5,6,7,8,9};

        //2.调用方法拷贝数据
        int[] copyArr=copyOFRange(arr,3,7);
        //3.遍历新数组
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }
    //将数组 arr 中从索引 from（包含 from）开始
    //到索引 to 结束（不包含to）的元素复制到新数组中
    public static int[] copyOFRange(int[] arr,int from,int to){//3~7(3 4 5 6)
        //1.定义数组
        int[] newArr=new int[to-from];
        //2。把原始数组 arr 中的 from 到 to 上对应元素，直接拷贝到 newArr 中

        //伪造索引的思想
        int index=0;
        for (int i = from; i < to; i++) {
            //arr[i]
            //格式：数组名【索引】=数据值
            newArr[index]=arr[i];
            index++;
        }
        //3.把新数组返回
        return newArr;
    }
}
