package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*需求：
        一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm。
        请用程序实现获取这三个和尚的最高身高。
         */

        //1.定义三个变量，记录他们的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;


        //2.拿着第一个和尚和第二个比较，
        //再拿着结果和第三个和尚比较
        int temp = height1 > height2 ? height1 : height2;
        int result = temp > height3 ? temp : height3;
        System.out.println(result);

    }
}
