package com.itheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        /*朋友聚会的时候可能会玩一个游戏：逢7过
        游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过：过
        需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
        分析：个位7  十位7   7倍数
        1 2 3 4 5 6 过 8 9 10 11 12 13 过 15 16 过 18 19 20 过....
        69 过 过 过 过 过 过... 80
         */

        //1.得到1-100之间的一个数字
        for (int i = 1; i <= 100; i ++){
            if (i %10 == 7 || i / 10 % 10 == 7 || i %7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

        //2.判断，符合条件，就打印过，否则打印出真实数值

    }
}
