package com.itheima.lambdademo;

public class LambdaDemo2 {
    public static void main(String[] args) {
        /*
        Lambda注意事项：
        1.Lambda表达式可以用来简化匿名内部类的书写
        2.Lambda表达式只能简化函数式接口的匿名内部类的写法
        3.函数式接口：有且仅有 一个抽象方法 的接口叫做函数式接口，接口上方可以加@FunctionalInterface
         */


        //1.利用匿名内部类
        //调用一个方法时，如果方法的形参是一个接口，要传递这个接口的实现对象
        //如果实现类对象只用一次，就可以用匿名内部类进行书写
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳");
            }
        });

        //利用Lambda表达式
        method(  () -> {System.out.println("正在游泳");}   );


    }

    public static void method(Swim s) {
        s.swimming();
    }
}


interface Swim {
    public abstract void swimming();
}
