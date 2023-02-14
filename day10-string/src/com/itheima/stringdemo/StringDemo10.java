package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        //手机号屏蔽 18846830860 -- 188****0860
        //1.获取一个手机号
        String phoneNumber = "18846830860";

        //2.截取前三位
        String phoneNumberStart = phoneNumber.substring(0,3);
        String phoneNumberEnd = phoneNumber.substring(7);
        String result = phoneNumberStart+"****"+phoneNumberEnd;
        System.out.println(result);
        //
        //
    }
}
