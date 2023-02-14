package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
         /*
            键盘录入一些1~100日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        */

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (count<=200){
        String line = sc.nextLine();
        int s = Integer.parseInt(line);
        if (s>100||s<1){
            System.out.println("输入数据不合法，请重新输入");
            continue;
        }
        count = count+s;
            list.add(s);//触发了自动装箱
        }
        System.out.println(count);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }





    }
}
