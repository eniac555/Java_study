package com.itheima.infiniteloop;

public class SkiploopDemo1 {
    public static void main(String[] args) {
        //跳过某次循环
        for (int i = 1;i <= 5;i++){
            if (i == 3){
                continue;//结束本次循环，继续下一次循环
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
