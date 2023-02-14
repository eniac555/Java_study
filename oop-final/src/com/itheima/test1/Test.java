package com.itheima.test1;

public class Test {
    public static void main(String[] args) {
        /*
        final 修饰的方法表示最终方法，不能被重写  //方法表示一个规则，不能改变时可以用final修饰
        final 修饰的类表示最终类，不能被继承
        final 修饰的变量表示常量，只能被赋值一次
         */

        final int a = 10;
        System.out.println(a);

        // a = 20; 会报错，只能赋值一次


    }
}

class Fu{
    public final void show(){
        System.out.println("父类的show方法");
    }
    //方法表示一个规则，不能改变时可以用final修饰
}

class Zi extends Fu{
    public void show1() {
        System.out.println("子类的show方法");
    }
}

