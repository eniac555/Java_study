package com.itheima.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001", "zhangsan", 9999.0, 2000.0);
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();


        Cooker c = new Cooker();
        c.setId("002");
        c.setName("lisi");
        c.setSalary(8000.0);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}
