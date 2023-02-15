package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {

        //1.创建集合的对象
        Collection<Student> coll = new ArrayList<>();

        //2.创建学生对象
        Student s1 = new Student(23,"zhangsan");
        Student s2 = new Student(24,"lisi");
        Student s3 = new Student(25,"xiazhu");

        //3.集合中加入学生对象
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.查询对象是否包含在集合
        Student s4 = new Student(23,"zhangsan");
        //因为contains方法在底层依赖equals方法判断对象是否一致的。
        //如果存的是自定义对象，没有重写equals方法，那么默认使用object类中的equals方法进行判断，
        //而object类中equals方法，依赖地址值进行判断.
        //需求:如果同姓名和同年龄，就认为是同一个学生。
        //所以，需要在自定义的Javabean类中，重写equals方法就可以了。|

        System.out.println(coll.contains(s4));//true
    }
}
