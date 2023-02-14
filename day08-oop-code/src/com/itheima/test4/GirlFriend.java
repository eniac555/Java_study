package com.itheima.test4;

public class GirlFriend {
    private int age;

    public void method(){
        int age = 10;//局部变量
        System.out.println(age);//就近原则，输出10.而不是0
        System.out.println(this.age);//输出0
    }
}
