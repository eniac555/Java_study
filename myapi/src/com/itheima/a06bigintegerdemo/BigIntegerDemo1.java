package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        /*
        public BigInteger(int num, Random rnd)  获取随机大整数，范围在[0,2的num次方减一]
        public BigInteger(String val)           获得指定的大整数
        public BigInteger(String val, int radix)  获得指定进制的大整数

        public static BigInteger valueOf(long val)  静态方法获取BigInteger的对象，内部有优化

        细节：
        对象一旦创建里面的数据就不能改变
         */

        //获取随机大整数
        BigInteger bd1 = new BigInteger(4,new Random());
        System.out.println(bd1);

        //获得指定大整数
        BigInteger bd2 = new BigInteger("99999999999999999999");
        System.out.println(bd2);

        //获得指定进制的大整数
        BigInteger bd3 = new BigInteger("100000",2);
        System.out.println(bd3);
        //细节：字符串中数字必须为整数，且数字要和进制吻合，如二进制只有01

        //静态方法获取BigInteger的对象，内部有优化
        //1.表示范围在long的范围内，不能超出
        //2.在内部把常用数字-16-16进行了优化，提前把-16-16先创建好BigInteger的对象，如果多次获取不会创建新的，他们是同一个，地址值也相同
        BigInteger bd4 = BigInteger.valueOf(100);
        System.out.println(bd4);
        System.out.println();

        //对象一旦创建里面的数据就不能改变
        BigInteger bd5 = BigInteger.valueOf(1);
        BigInteger bd6 = BigInteger.valueOf(2);
        System.out.println(bd5.add(bd6));
        //此时不会修改参与计算的BigInteger种的值，而是产生新的BigInteger对象记录3
    }
}
