package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        /*
        public BigDecimal add(BigDecimal value)				// 加法运算
        public BigDecimal subtract(BigDecimal value)		// 减法运算
        public BigDecimal multiply(BigDecimal value)		// 乘法运算
        public BigDecimal divide(BigDecimal value)			// 除法运算

        public BigDecimal divide(BigDecimal value，精确几位，舍入几位)			// 除法运算
         */

        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(2.0);

        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        BigDecimal bd6 = bd2.divide(bd1);//除不尽会报错
        System.out.println(bd6);

        BigDecimal bd7 = bd2.divide(bd1,2, RoundingMode.HALF_UP);//除不尽会报错
        System.out.println(bd7);




    }
}
