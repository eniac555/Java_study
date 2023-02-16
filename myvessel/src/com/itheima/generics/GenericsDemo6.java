package com.itheima.generics;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个方法，形参是一个集合，但是集合中的数据类型不确定
         */
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<Student> list4 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
        //method(list4);

        //泛型不具备继承性，除了YE FU ZI这三个有继承关系的对象外，Student对象也可以调用
        //解决方案：泛型统配符
        //?表示不确定的类型
        //也可以进行类型限定
        //? extends E:表示可以传递E或者E的子类
        //? super E:表示可以传递E或者E的父类


    }

    //利用泛型方法有个小弊端，他可以接收任意的数据类型

    //应用场景：
    //1.如果我们在定义类，方法，接口的时候，类型不确定，就可以用泛型类，泛型方法，泛型接口
    //2.如果类型不确定，但希望能传递某个继承结构中的，可以用泛型通配符

    //关键点：限定类型的范围


    public static<E> void method(ArrayList<? extends Ye> list) {

    }
}
class Student{}
