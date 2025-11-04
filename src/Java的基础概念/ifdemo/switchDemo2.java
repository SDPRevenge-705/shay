package Java的基础概念.ifdemo;
/*
* default的位置和省略
* 1.位置：defaule不一定是写在最下面，可以写在任意位置，只不过习惯写在最下面
* 2.省略：default可以省略，语法也不会有问题，但是不建议省略
* */
public class switchDemo2 {
    public static void main(String[] args) {
        int number = 1;
        switch (number){
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
//            default:
//                System.out.println("number的值不是1也不是10也不是20");
//                break;
        }
    }
}
