package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        /*
        构造方法获取BigDecimal的对象
        public BigDecimal(double val)
        public BigDecimal(String val)

        静态方法获取BigDecimal的对象
        public static BigDecimal valueOf(double val)
         */

        //这种方式不精确，不建议
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);

        //建议下面这两种
        BigDecimal bd3 = new BigDecimal("0.01");
        System.out.println(bd3);

        //静态方法
        BigDecimal bd4 = BigDecimal.valueOf(10);
        System.out.println(bd4);//10

        //细节
        //如果表示的数字不大，没有超过double的范围，建议使用静态方法
        //如果超过double范围，建议使用构造方法
        //如果传递[0-10]之间的整数对象，方法会返回已经提前创建好的对象，不会新建


    }
}
