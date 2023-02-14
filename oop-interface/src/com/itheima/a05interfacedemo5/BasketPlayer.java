package com.itheima.a05interfacedemo5;

public class BasketPlayer extends Sporter{

    public BasketPlayer(){

    }

    public BasketPlayer(String name,int age){
        super(name,age);
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员在学习打篮球");
    }
}
