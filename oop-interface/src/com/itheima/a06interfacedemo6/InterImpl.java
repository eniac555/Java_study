package com.itheima.a06interfacedemo6;

public class InterImpl implements InterA,InterB {
    @Override
    public void show1() {
        System.out.println("重写了抽象方法");
    }

    @Override
    public void show2() {
        System.out.println("重写的默认方法");
    }
}
