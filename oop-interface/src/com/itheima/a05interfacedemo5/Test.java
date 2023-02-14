package com.itheima.a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        PingPangPlayer pps = new PingPangPlayer("刘诗雯",23);
        System.out.println(pps.getName()+", "+pps.getAge());
        pps.learn();
        pps.speakEnglish();
    }
}
