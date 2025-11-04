package itheima.面向对象案例;

public class GameTest2 {
    public static void main(String[] args) {
        //1.创建第一个角色
        Role2  r1 = new Role2("乔峰",100,'男');
        //2.创建第二个角色
        Role2  r2 = new Role2("段誉",100,'男');

        //展示角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();

       //3.开始格斗  回合制游戏
        while (true){
            //r1开始攻击 r2
            r1.attack(r2);
            //判断 r2的剩余血量
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+"K.O了"+r2.getName());
                break;
            }

            //r2开始攻击 r1
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+"K.O了"+r1.getName());
                break;
            }

        }
    }
}
