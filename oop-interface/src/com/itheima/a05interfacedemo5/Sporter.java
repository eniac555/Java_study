package com.itheima.a05interfacedemo5;

public abstract class Sporter extends Person{
    //变量不用动
    //构造方法
    public Sporter(){

    }

    public Sporter(String name,int age){
        super(name,age);
    }

    //方法
    public abstract void learn();

}
