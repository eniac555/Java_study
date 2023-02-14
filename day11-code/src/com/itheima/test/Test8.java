package com.itheima.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个Javabean类：Phone，属性有品牌和价格
        main方法中定义一个集合，存入三个手机对象
        定义一个方法，将价格低于3000的手机信息全部返回
         */

        //1.定义集合
        ArrayList<Phone> list = new ArrayList<>();

        //2.创建手机对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        //3.加入集合
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4.输出结果
        ArrayList<Phone> phoneArrayList = getPhoneInfo(list);

        //5.遍历
        for (int i = 0; i < phoneArrayList.size(); i++) {
            Phone phone = phoneArrayList.get(i);
            System.out.println(phone.getBrand() + ", " + phone.getPrice());
        }
    }


    //定义方法，返回价格低于3000的全部手机的信息
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        //定义新集合用于返回新的结果
        ArrayList<Phone> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }

}
