package com.itheima.a05interfacedemo5;

public class BasketCoach extends Coach{
    public BasketCoach(){

    }

    public BasketCoach(String name,int age){
        super(name,age);
    }


    @Override
    public void teach() {
        System.out.println("篮球教练在教打篮球");
    }
}
