package com.itheima.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        Zi z1 = new Zi();
        //z1 z2 = new Zi("张三",21);
        //子类不能集继承父类的构造方法
    }
}

class Fu{
    String name;
    int age;

    public Fu(){}
    public Fu(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu{

}
