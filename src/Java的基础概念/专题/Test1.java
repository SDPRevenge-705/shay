package Java的基础概念.专题;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //机票价格按照淡季旺季、头等舱经济舱收费、输入机票原价、月份和头等舱或者经济舱
        //按照一下规则计算机票价格，旺季（5-10月）头等舱9折，经济舱 8.5折，淡季（11-4月）头等舱7折，经济舱 6.5折

        //1.键盘录入机票原价、月份和头等舱或者经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int ticket = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入 0 头等舱或者 1 经济舱：");
        int seat = sc.nextInt();
        //2.先判断月份是旺季还是淡季
        //ctrl + alt + M 自动抽取方法
        //MAc:command+option+M
        if (month >= 5 && month <= 10){
            //旺季
            //3.继续判断当前机票是经济舱还是头等舱
            //ticket = getPrice(ticket,seat,0.9,0.85);
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        }else if ((month >=1 && month <=4) || (month >= 11 && month <=12)) {
            //淡季
            //ticket = getPrice(ticket,seat,0.7,0.65);
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        } else {
            System.out.println("您录入的月份是一个非法数据");
        }
        //4.根据实际情况计算对应价格
        System.out.println(ticket);
    }

    public static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            //头等舱
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            //经济舱
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }

    //1.干什么？根据舱位和折扣来计算最终的票价
    //2.我干这件事情，需要什么才能完成？原价 舱位 头等舱折扣  经济舱折扣
    //3.方法的调用处是否需要继续使用这个结果？需要使用返回值
    /*public static int getPrice(int ticket,int seat,double v0,double v1){
        if (seat == 0) {
            //头等舱
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            //经济舱
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }*/
}
