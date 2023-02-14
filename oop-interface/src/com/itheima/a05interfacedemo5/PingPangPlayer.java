package com.itheima.a05interfacedemo5;

public class PingPangPlayer extends Sporter implements SpeakEnglish{
    public PingPangPlayer(){

    }

    public PingPangPlayer(String name,int age){
        super(name,age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
