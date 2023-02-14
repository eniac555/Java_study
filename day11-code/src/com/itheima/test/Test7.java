package com.itheima.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        /*
        1.main方法中定义一个集合，存入三个用户对象
        用户属性为：id,username,password
        2.要求：定义一个方法，根据id查找对应的用户信息
        如果存在，返回索引，否则返回-1
         */

        //1.定义集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建三个用户对象
        User u1 = new User("heima001","zhangsan","123456");
        User u2 = new User("heima002","lisi","12345678");
        User u3 = new User("heima003","wangwu","1234qwer");

        //3.用户对象添加到集合
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.调用方法查看是否存在
        System.out.println(getIndex("heima002",list));

    }



    //根据Id查找
    public static int getIndex(String id,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)){
                return i;
            }
        }

        return -1;
    }
}
