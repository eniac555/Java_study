package com.itheima.a01innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(Car this){
        //System.out.println(engineName); 没创建对象会报错
        System.out.println(this.carName);
        Engine e = new Engine();//得先创建对象
        System.out.println(e.engineName);//不会报错
    }


    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
