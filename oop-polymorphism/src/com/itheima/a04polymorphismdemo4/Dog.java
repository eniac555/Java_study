package com.itheima.a04polymorphismdemo4;

public class Dog extends Animal {
    //属性和父类一致，不用动

    //构造方法
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //get  set 不用动，属性和父类一样

    //行为

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "色的狗两只前腿死死地抱着" + something + "猛吃");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
