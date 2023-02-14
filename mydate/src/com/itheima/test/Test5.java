package com.itheima.test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        /*
            判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:
            二月有29天是闰年一年有366天是闰年
        */

        //jdk7
        //我们可以把时间设置为2000年3月1日
        //再把日历往前减去一天
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2000);
        c.set(Calendar.MONTH, 2);
        c.set(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //可以设置2001年1月1日
        //往前减去一天，统计是一年中的第几天


        //JDK8
        LocalDate ld = LocalDate.of(2000,3,1);
        LocalDate date = ld.minusDays(1);
        System.out.println(date.getDayOfMonth());

        System.out.println(ld.isLeapYear());
    }
}
