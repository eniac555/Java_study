package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo6 {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;//先用后加
        int z = ++x;//先加后用
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);
    }
}
