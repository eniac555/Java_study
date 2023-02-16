package com.itheima.test;

public class LiHuaCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的"+getAge()+"岁的梨花猫，正在吃小鱼");
    }
}
