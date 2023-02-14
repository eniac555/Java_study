package com.itheima.a01jdk7datedemo;

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo1 {
    public static void main(String[] args) {
        /*
        public static Calendar getInstance()       获取当前时间的日历对象

        public final Date getTime()                获得日期对象
        public final setTime(Date date)            给日历设置日期对象

        public long getTimeMillis()                拿到时间毫秒值
        public void setTimeMillis(long millis)     给日历设置时间毫秒值

        public int get(int field)                  获取日期中某个字段的信息
        public void set(int field, int value)      修改日期中某个字段的信息
        public void add(int field, int amount)     为某个字段增加/减少指定的值

         */

        //1.获取日历对象
        //细节1：Calender是抽象类，不能直接new，而是通过静态方法获取子类对象
        //底层原理：会根据不同时区获取不同的日历对象
        //把时间中的纪元，年，月，日，时间，分，秒等都放进一个数组中，
        //细节2：月份的范围是0-11，星期日是一周中的第一天
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2.修改日历时间

        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);


        //public int get(int field)                  获取日期中某个字段的信息
        //public void set(int field, int value)      修改日期中某个字段的信息
        //public void add(int field, int amount)     为某个字段增加/减少指定的值

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + ", " + month + ", " + date);

        c.set(Calendar.YEAR,2000);
        System.out.println(c.get(Calendar.YEAR));

        c.add(Calendar.YEAR,10);
        System.out.println(c.get(Calendar.YEAR));

    }
}
