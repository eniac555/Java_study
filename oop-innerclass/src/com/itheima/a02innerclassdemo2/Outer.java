package com.itheima.a02innerclassdemo2;

public class Outer {
    String name;

    class Inner{
        static int a = 16;
    }

    //编写方法对外提供内部类对象，内部类私有时候可以用
    public Inner getInstance(){
        return new Inner();
    }
}
