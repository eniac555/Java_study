package com.itheima.a07interfacedemo7;

public class InterImpl implements Inter{

    @Override
    public void show1() {
        System.out.println("重写的接口的抽象方法");
    }

    public static void show2() {
        System.out.println("方法");
    }
}
