package com.itheima.test1;

public class GameTest {
    public static void main(String[] args) {
        //1.创建第一个角色
        Role r1 = new Role("乔峰",100);
        //2.创建第二个角色
        Role r2 = new Role("鸠摩智",100);

        //3.开始格斗  回合制
        while (true){
            //r1攻击r2
            r1.attack(r2);
            //判断r2剩余血量
            if (r2.getBlood()==0){
                System.out.println(r1.getName()+"KO"+r2.getName());
                break;
            }

            //r2攻击r1
            r2.attack(r1);
            //判断r1剩余血量
            if (r1.getBlood()==0){
                System.out.println(r2.getName()+"KO"+r1.getName());
                break;
            }
        }


    }
}
