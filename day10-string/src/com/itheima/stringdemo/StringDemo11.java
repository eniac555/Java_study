package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //身份证信息查看，不同位次代表不同信息
        //7-14位，出生年月日  17位 性别
        //输出结果格式：
        /*人物信息为：
        出生年月日：  XXXX年XX月XX日
        性别为：男/女
         */
        //
        String id = "371178199705207251";

        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);

        //String gender = id.substring(16,17);
        //会出问题

        //id.charAt()结果才能和整数进行加减运算
        char gender = id.charAt(16);
        String realGender;
        /*
        '0' -- 48
        '1' -- 49
        '2' -- 50
        '3' -- 51
        '4' -- 52
        '5' -- 53
        '6' -- 54
        '7' -- 55
        '8' -- 56
        '9' -- 57
         */

        if ((gender-48)%2==0){
            realGender = "女";
        }
        else {
            realGender = "男";
        }
        System.out.println("人物信息为：");
        System.out.println("出生年月日为："+year+"年"+month+"月"+day+"日");
        System.out.println("性别为："+realGender);
    }
}
