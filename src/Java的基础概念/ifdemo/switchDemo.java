package Java的基础概念.ifdemo;

public class switchDemo {
    public static void main(String[] args) {
        //1.定义变量记录我想吃的面
        String noodles="海鲜面";

        //2.拿着这个面利用switch跟四种面条匹配
        switch (noodles){
            case "兰州拉面":
                System.out.println("我想吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("我想吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("我想吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("我想吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
