package com.itheima.a10oopextendsdemo10;

public class Cooker extends Employee{
    public Cooker(){}

    public Cooker(String id, String name, double salary){
        super(id,name,salary);
    }

    @Override
    public void work() {
        System.out.println("厨师在炒菜");
    }
}
