package com.itheima.a01jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        /*
        需求1：打印时间原点后一年的时间
        需求2：定义任意两个Date对象，比较那个时间在前，那个在后
         */

        Random r = new Random();
        //创建两个时间对象
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);

        if (d1.getTime()>d2.getTime()){
            System.out.println("第一个时间在后面，第二个时间在前面");
        }else if (d1.getTime()<d2.getTime()){
            System.out.println("第二个时间在后面，第一个时间在前面");
        }else {
            System.out.println("一样");
        }


    }

    //需求1：打印时间原点后一年的时间
    private static void extracted() {
        //创建对象，表示时间原点
        Date d1 = new Date(0L);
        System.out.println(d1);
        //获取其毫秒时间
        long time = d1.getTime();
        //加上一年
        time = time + 1000L * 60 * 60 * 24 * 365;
        //再返回到原对象
        d1.setTime(time);
        System.out.println(d1);
    }
}
