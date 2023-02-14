package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        定义方法实现随机产生一个5位的验证码
        验证码格式：
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字
         */

        //方法：在一堆没有随机规律的一组数据中抽取，可以把他们放在数组中

        //分析
        //1.字母放到数组中
        char[] chs= new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i<=25){
                //小写字母
                chs[i] = (char) (97+i);
            }else {
                //大写字母
                chs[i] = (char) (65+i-26);
            }
        }



        //定义字符串类型变量，记录最终的结果
        String result = "";

        //2.随机抽取四次
        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(52);
            result = result + chs[randomIndex];
        }


        //3.再抽一个数字
        int number = r.nextInt(10);
        result = result+number;
        System.out.println(result);


    }
}
