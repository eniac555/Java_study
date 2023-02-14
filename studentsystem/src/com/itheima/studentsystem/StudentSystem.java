package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-----------欢迎来到学生管理系统------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUERY_STUDENT -> queryStudent(list);
                case EXIT -> {
                    System.out.println("退出");
                    break loop;
                    //第二种方法：system.exit(0)，意思是停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }

        }
    }


    //1.添加学生信息
    public static void addStudent(ArrayList<Student> list) {
        System.out.println("开始添加学生...");
        Student stu = new Student();//无参创建便于后面修改
        Scanner sc = new Scanner(System.in);
        String id = null;

        while (true) {
            System.out.println("请输入学生id...");
            id = sc.next();
            boolean flag = contains1(list, id);
            if (flag) {
                System.out.println("当前id已经存在，请重新输入");
            } else {
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名...");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生年龄...");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生家庭住址...");
        String address = sc.next();
        stu.setAddress(address);

        //Student stu = new Student(id, name, age, address);
        list.add(stu);

        System.out.println("学生信息添加成功！");
    }


    //2.删除学生信息
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("开始删除学生...");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的id...");
        String id = sc.next();

        int index = getIndex1(list, id);
        if (index >= 0) {
            //Id存在，开始删除
            list.remove(index);
            System.out.println("id为" + id + "的学生删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }

    }


    //3.修改学生信息
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("开始修改学生...");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的id");
        String id = sc.next();

        int index = getIndex1(list, id);
        if (index >= 0) {
            //id存在，开始修改
            Student stu = list.get(index);
            System.out.println("请输入要修改的学生姓名");
            String newName = sc.next();
            stu.setName(newName);

            System.out.println("请输入要修改的学生年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);

            System.out.println("请输入要修改的学生住址");
            String newAddress = sc.next();
            stu.setAddress(newAddress);

            System.out.println("学生信息修改成功");

        } else {
            System.out.println("当前id不存在，请重新输入");
        }
    }


    //4.查询学生信息
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("开始查询学生...");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的id...");
        String id = sc.next();

        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() +
                        "\t" + list.get(i).getAge() + "\t" + list.get(i).getAddress());
            }
        }
        System.out.println("没有查询到id为" + id + "的学生信息");

    }


    //判断id是否唯一
    public static boolean contains1(ArrayList<Student> list, String id) {
        int index = getIndex1(list,id);
        if (index>=0){
            return true;
        }else {
            return false;
        }
    }


    //通过id获取索引的方法
    public static int getIndex1(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }


}
