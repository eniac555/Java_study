package com.itheima.a04polymorphismdemo4;

public class Cat extends Animal{
    //属性不用动

    //构造方法
    public Cat(){}
    public Cat(int age,String color){
        super(age,color);
    }

    //get set 不用动

    //行为

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor()
                + "色的猫眯着眼睛侧着头吃" + something );
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
