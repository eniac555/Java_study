package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /* 需求:
            秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
            秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0
            用代码说明这两位同学有没有参加上秒杀活动?
         */

        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String jia = "2023年11月11日 0:01:0";
        String pi = "2023年11月11日 0:11:0";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        Date startTime = sdf.parse(start);
        Date endTime = sdf.parse(end);
        Date jiaTime = sdf.parse(jia);
        Date piTime = sdf.parse(pi);

        System.out.println("小贾" + check(startTime, endTime, jiaTime));
        System.out.println("小皮" + check(startTime, endTime, piTime));


    }

    public static String check(Date startTime, Date endTime, Date time) {
        String s;
        if (time.getTime() >= startTime.getTime() && time.getTime() <= endTime.getTime()) {
            s = "参与了秒杀活动";
        } else {
            s = "没有参与秒杀活动";
        }
        return s;
    }
}
