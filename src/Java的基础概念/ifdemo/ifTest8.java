package Java的基础概念.ifdemo;

public class ifTest8 {
    public static void main(String[] args) {
        //汽车无人驾驶会涉及到大量的判断
        /* 当汽车行驶的时候遇到红绿灯就会进行判断
        如果红灯亮，就停止
        如果绿灯亮，就行驶
        如果黄灯亮，就减速
        */

        //1.定义三个变量表示灯灯状态
        //true亮。 flase灭
        boolean isLightGreen=true;
        boolean isLightYellow=false;
        boolean isLightRed=false;
        //2.判断
        //红灯亮，就停止
        //绿灯亮，就行驶
        //黄灯亮，就减速
        if (isLightGreen){
            System.out.println("gogogo!!!");
        }else if (isLightYellow){
            System.out.println("slow!!!");
        }else if (isLightRed){
            System.out.println("stop!!!");
        }


    }
}
