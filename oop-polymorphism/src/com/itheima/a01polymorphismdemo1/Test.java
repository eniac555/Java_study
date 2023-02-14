package com.itheima.a01polymorphismdemo1;

public class Test {
    //多态在起作用
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);


        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(40);

        Administrator a = new Administrator();
        a.setName("管理员");
        a.setAge(35);

        register(s);
        register(t);
        register(a);
    }

    //既能接收老师，又能接收学生，也能接收管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p){
        p.show();
    }
}
