package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成

        //JDK7
        //规则:只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值

        //1.计算出生年月日的毫秒值
        String brith = "1997-02-24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date brithDay = sdf.parse(brith);
        long time = brithDay.getTime();
        System.out.println(time);

        //2.获取当前时间的毫秒值
        long now = System.currentTimeMillis();
        System.out.println(now);

        long life = now-time;
        System.out.println(life/1000/60/60/24);


        //JDK8
        LocalDate ld1 = LocalDate.of(1997,2,24);
        LocalDate now1 = LocalDate.now();
        long between = ChronoUnit.DAYS.between(ld1, now1);
        System.out.println(between);
    }
}
