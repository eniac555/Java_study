package com.itheima.test2;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;

    //针对私有化变量，都要提供set和get方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("不合法年龄");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


    //行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
