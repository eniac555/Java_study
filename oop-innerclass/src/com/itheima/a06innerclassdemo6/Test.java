package com.itheima.a06innerclassdemo6;

public class Test {
    public static void main(String[] args) {


        //编写匿名内部类的代码  整体可以看做Swim接口的实现类对象，可以赋值
        //接口多态
        Swim s = new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳方法");
            }
        };


        //可以调用方法，因为整体是一个对象，所以可以调用自己类里面的所有方法
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳方法");
            }
        }.swim();


        new Animal(){

            @Override
            public void eat() {
                System.out.println("重写了吃饭方法");
            }
        };

        //如何在测试类中调用下面的method方法？
        //以前如何调用？要自己写一个子类继承Animal类，再创建子类的对象，传递给method方法
        Dog d = new Dog();
        method(d);


        //如果dog类只用一次，太麻烦，可以用匿名内部类简化代码
        //如下

        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        });

    }

    public static void method(Animal a){
        a.eat();
    }
}
