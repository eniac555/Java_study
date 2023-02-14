package com.itheima.infiniteloop;

public class SkiploopDemo2 {
    public static void main(String[] args) {
        for (int i = 1;i <= 5;i++){
            System.out.println("小老虎在吃第" + i + "个包子");
            if (i == 3){
                break;//结束整个循环，后面不在继续进行
            }

        }
    }
}
