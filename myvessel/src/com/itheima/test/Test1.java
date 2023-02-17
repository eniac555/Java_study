package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        /*
        测试类中定义一个方法用于饲养动物
        public static void keepPet(ArrayList<???> list)

        //遍历集合，调用动物的eat方法
        要求1: 该方法能养所有品种的猫，但是不能养狗
        要求2: 该方法能养所有品种的狗，但是不能养猫
        要求3:该方法能养所有的动物，但是不能传递其他类型
         */

        ArrayList<LiHuaCat> list1 = new ArrayList<>();
        ArrayList<PersianCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();
        ArrayList<Cat> list5 = new ArrayList<>();

        keepPet1(list1);
        keepPet1(list2);




    }
    public static void keepPet1(ArrayList<?extends Cat> list){}

    public static void keepPet2(ArrayList<?extends Dog> list){}

    public static void keepPet3(ArrayList<?extends Animal> list){}
}
