package com.itheima.test6;

public class PhoneTest {
    public static void main(String[] args) {
        /*
        定义数组存储3部手机对象。
        手机的属性：品牌，价格，颜色。
        要求，计算出三部手机的平均价格
         */

        //1.创建一个数组
        Phone[] arr = new Phone[3];

        //2.创建手机对象
        Phone p1 = new Phone("小米",1999,"白色");
        Phone p2 = new Phone("华为",4999,"蓝色");
        Phone p3 = new Phone("魅族",3999,"红色");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int p = arr[i].getPrice();
            sum = sum+p;
        }
        System.out.println(sum);
        System.out.println(sum/(arr.length+0.0));
    }
}
