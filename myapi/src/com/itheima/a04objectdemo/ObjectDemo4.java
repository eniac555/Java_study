package com.itheima.a04objectdemo;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected Object clone(int a)   对象克隆  浅克隆：所有东西都是直接复制一遍，引用数据类型复制地址

        //深克隆：引用数据类型先把原数据复制到新的空间，把复制后的数据的地址赋值给克隆后的对象

        //创建对象
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1 = new User(1,"zhangsan","12345","girl1",data);

        //克隆对象
        //细节
        //方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去
        //书写细节
        //1.重写object中的clone方法
        //2.让javabean类实现cloneable接口
        //3.创建原对象并调用clone就可以了
        User u2 = (User) u1.clone();
        User u3 = (User) u1.cloneDeep();
        int[] arr = u1.getDate();
        arr[0] = 100;
        System.out.println(u1);
        System.out.println(u2);//浅克隆
        System.out.println(u3);//深克隆

        //第三方工具
        //1.第三方写的代码导入到项目中
        //2.编写代码
        int[] data1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u4 = new User(1,"zhangsan","12345","girl1",data1);
        Gson gson = new Gson();
        //把对象变成一个字符串
        String s = gson.toJson(u4);
        System.out.println(s);
        //再把字符串变成对象
        User user = gson.fromJson(s, User.class);
        //验证深浅克隆  深克隆
        int[] arr1 = u4.getDate();
        arr1[0] = 100;
        System.out.println(u4);
        System.out.println(user);
    }
}
