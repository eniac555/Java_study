package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        /*
        public BigInteger add(BigInteger val)                   加法
        public BigInteger subtract(BigInteger val)              减法
        public BigInteger multiply(BigInteger val)              乘法
        public BigInteger divide(BigInteger val)                除法
        public BigInteger[] divideAndRemainder(BigInteger val)  除法，获取商和余数
        public boolean equals(Object x)                         比较是否相同
        public BigInteger pow(int exponent)                     次幂、次方
        public BigInteger max/min(BigInteger val)               返回较大值/较小值
        public int intValue(BigInteger val)                     转为int类型整数，超出范围数据有误
         */

        BigInteger bd1 = new BigInteger("10");
        BigInteger bd2 = new BigInteger("5");

        System.out.println(bd1.add(bd2));

        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(bd1.equals(bd2));

        System.out.println(bd1.pow(2));

        System.out.println(bd1.max(bd2));
    }
}
