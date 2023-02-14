package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /*
            public simpleDateFormat() 默认格式
            public simpleDateFormat(String pattern) 指定格式

            public final string format(Date date) 格式化(日期对象 ->字符串)
            public Date parse(string source) 解析(字符串 ->日期对象)
        */

        //1.空参构造
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date(0L);
        String str = sdf.format(d);
        System.out.println(str);//1970/1/1 上午8:00

        //带参构造
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d);
        System.out.println(str2);//1970年01月01日 08:00:00

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str3 = sdf3.format(d);
        System.out.println(str3);//1970年01月01日 08:00:00 周四

        //解析
        //定义字符串表示时间
        String str4 = "2023-11-11 11:11:11";

        //利用空参构造创建SimpleDateFormat对象
        //细节
        //创建对象的格式要和字符串格式一致
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf4.parse(str4);
        System.out.println(date);//Sat Nov 11 11:11:11 CST 2023
        System.out.println(date.getTime());


    }
}
