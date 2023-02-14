package com.itheima.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf = new GirlFriend();
        gf.setName("小诗诗");
        gf.setAge(20);
        gf.setGender("女");

        String name = gf.getName();
        int age = gf.getAge();
        String gender = gf.getGender();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);

        gf.sleep();
        gf.eat();

    }
}
