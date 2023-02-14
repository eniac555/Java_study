package com.itheima.a01abstractdemo1;

//抽象类
public abstract class Person {

    public abstract void work();

}

/*
抽象类不能实例化，即抽象类不能创建对象
抽象类中不一定有抽象方法，但是有抽象方法的类一定是抽象类
可以有构造方法  给子类用
抽象类的子类：要么重写抽象类中所有的抽象方法，要么子类也是抽象类
 */