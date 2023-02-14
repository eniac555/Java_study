package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
            自己实现parseInt方法的效果，将字符串形式的数据转成整数。
            要求:
            字符串中只能是数字，不能有其他字符，最少一位，最多10位，0不能开头
        */

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;

        double sum = 0.0;//pow()的结果是double类型

        char[] arr = new char[s.length()];

        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        //校验字符串
        if (!s.matches("[1-9]\\d{0,9}")) {
            System.out.println("数据格式有误");
        } else {
            System.out.println("数据格式正确");
            for (int i = 0; i < s.length(); i++) {
                arr[i] = s.charAt(i);
                int j = getIndex(arr[i], number);//int c = s.charAt(i)-'0
                count = count * 10 + j;
                sum = sum + j * Math.pow(10.0, s.length() - i - 1.0);
            }
            int result = (int) sum;
            System.out.println(result);
            System.out.println(result + 1);
            System.out.println(count);
        }


    }

    private static int getIndex(char c, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
