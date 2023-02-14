package com.itheima.a01oopextendsdemo1;

public class Animal {

    //权限修饰符改成私有private，子类就无法访问
    //子类只能访问父类中非私有的东西
    public void eat(){
        System.out.println("吃东西");
    }

    public void drink(){
        System.out.println("喝水");
    }
}
