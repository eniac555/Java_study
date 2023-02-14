package com.itheima.a01staticdemo1;

public class Student {
    /*
     需求：写一个JavaBean类来描述这个班级的学生
     属性：姓名、年龄、性别
     行为：学习
     */
    //新增属性：老师的姓名
    private String name;
    private int age;
    private String gender;
    public static String teacherName;//表示所有学生类共享同一个老师

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

   //行为
    public void study(){
        System.out.println(name+"正在学习");
    }

    public void show(){
        System.out.println(name+", "+age+", "+gender+", "+teacherName);
    }
}
