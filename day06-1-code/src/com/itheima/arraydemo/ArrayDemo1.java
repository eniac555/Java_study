package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //格式：
        //静态初始化
        //完整格式： 数据类型 [] 数组名 = new 数据类型[]{元素1，元素2，...元素n}
        //简化格式： 数据类型 [] 数组名 = {元素1，元素2，...元素n}

        //需求1：定义数组存储五个学生的年龄
        int [] age1 = {11, 12, 13};
        int [] age2 = new int[]{11, 12, 13};

        //需求2：定义数组存储3个学生的姓名
        String [] name1 = new String[]{"张三", "李四", "王五"};
        String [] name2 = {"张三", "李四", "王五"};

        //需求3：定义数组存储4个学生的身高
        double [] height1 = new double[]{1.75, 1.83, 1.93, 1.84};
        double [] height2 = {1.75, 1.83, 1.93, 1.84};

        //直接打印数组名，输出的是地址值
        System.out.println(height2);
        //[D@4eec7777，[：表示数组；D：表示数据类型double；@：间隔符号；后面：才是真正的地址值

        System.out.println(height2[2]);

    }
}
