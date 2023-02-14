package com.itheima.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个数，1-5工作日，6-7休息日
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入周几");
        int week = sc.nextInt();

        switch (week){
            case 1,2,3,4,5-> System.out.println("工作日");
            case 6,7-> System.out.println("休息日");
            default -> System.out.println("没有这个日期");

        }


//        switch (week){
//            case 1,2,3,4,5:
//                System.out.println("工作日");
//                break;
//            case 6,7:
//                System.out.println("休息日");
//                break;
//            default:
//                System.out.println("没有这个日期");
//                break;
//        }


//        switch (week){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("工作日");
//                break;
//            case 6:
//            case 7:
//                System.out.println("休息日");
//                break;
//            default:
//                System.out.println("没有这个日期");
//                break;
//        }
    }
}
