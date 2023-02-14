package com.itheima.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //敏感词替换
        //1.获取到说的话
        String talk = "你玩的真好，以后不要再玩了，TMD，SB";

        //定义敏感词库
        String[] arr = {"TMD","CNM","SB","MLGB"};
        String result;
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        //2.敏感词替换为***

        //3.打印
        System.out.println(talk);
    }
}
