package com.itheima.codeblockdemo1;

public class Student {
    private String name;
    private  int age;

    //构造代码块
    //1.写在成员位置的代码块
    //2.作用：可以把多个构造方法中重复的代码抽取出来
    //3.执行时机：在创建本类对象的时候，会先执行构造代码块再执行构造方法
    {
        System.out.println("开始创建对象");
    }


    //静态代码块   在构造代码块前面加上static
    //执行时机：随着类的加载而加载，并且只执行一次
    //可以用作初始化
    //
    static
    {
        System.out.println("静态代码块，开始创建对象");
    }


    public Student() {
        System.out.println("空参构造");

    }

    public Student(String name, int age) {

        System.out.println("有参构造");
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
