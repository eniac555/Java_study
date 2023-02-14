package com.itheima.a09interfacedemo9;

public class InterImpl extends InterAdapter{
    //适配器模式
   //用到那个方法，就重写哪一个即可

    @Override
    public void method5() {
        System.out.println("只调用第五个方法");
    }
}
