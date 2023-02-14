package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdDemo2 {
    public static void main(String[] args) {
        /*
            static Instant now() 获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
            ZonedDateTime atZone(ZoneId zone) 指定时区
            boolean isxxx(Instant otherInstant) 判断系列的方法
            Instant minusXxx(long millisToSubtract) 减少时间系列的方法
            Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        */

        //1.获取当前时间的Instant对象，标准时间，无时区
        Instant now = Instant.now();
        System.out.println(now);

        //2.根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        //3.指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        //4.判断系列的方法
        Instant instant2 = Instant.ofEpochMilli(100L);
        Instant instant3 = Instant.ofEpochMilli(200L);
        System.out.println(instant2.isBefore(instant3));
        System.out.println(instant2.isAfter(instant3));

        //5.减少时间系列的方法
        Instant instant5 = Instant.ofEpochMilli(100000L);
        System.out.println(instant5);
        Instant instant6 = instant5.minusMillis(100);
        System.out.println(instant6);

        //6.增加时间系列的方法

    }
}
