package com.itheima.test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        /*
        定义数组存储3部汽车对象。
        汽车的属性：品牌，价格，颜色。创建三个汽车对象，
        数据通过键盘录入而来，并把数据存入到数组当中。
         */

        //1.创建一个数组来存三个汽车对象
        Car[] arr = new Car[3];

        //2.创建汽车对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车的对象
            Car c = new Car();

            //键盘录入获取数据
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            c.setBrand(brand);

            //录入价格
            System.out.println("请输入汽车价格");
            int price = sc.nextInt();
            c.setPrice(price);

            //录入颜色
            System.out.println("请输入汽车颜色");
            String color = sc.next();
            c.setColor(color);

            //把汽车对象添加到数组中
            arr[i] = c;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + ", " + car.getPrice() + ", " + car.getColor());
        }
    }
}
