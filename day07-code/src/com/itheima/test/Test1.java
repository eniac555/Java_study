package com.itheima.test;

import java.util.Scanner;

//ctrl+alt+m  自动抽取方法

public class Test1 {
    public static void main(String[] args) {
        /*
        需求: 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
         */

        //1.键盘录入淡季旺季、机票价格、头等还是将机舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int price = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入购买的舱位，0头等舱，1经济舱");
        int seat = sc.nextInt();


        //2.判断是否淡季旺季
        if (month >= 5 && month <= 10) {
            //3.经济舱还是头等舱
            price = getPrice(price, seat, 0.9, 0.85);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            //3.经济舱还是头等舱
            price = getPrice(price, seat, 0.7, 0.65);

        } else {
            System.out.println("不合法的月份");
        }

        System.out.println(price);

    }

    public static int getPrice(int price, int seat, double v0, double v1) {
        if (seat == 0) {
            price = (int) (price * v0);
        } else if (seat == 1) {
            price = (int) (price * v1);
        } else {
            System.out.println("不合法舱位");
        }
        return price;
    }
}
