package com.itheima.a10oopextendsdemo10;

public class Manager extends Employee {
    private double bonus;

    //空参构造
    public Manager() {
    }

    //全参构造，父类+子类
    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bonus = bouns;
    }

    //前三个成员变量的get和set方法父类中已经存在，无需设置

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
