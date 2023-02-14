package com.itheima.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        //调用成员变量：编译看左边，运行也看左边，所以是Animal类中的name，输出结果为 动物
        //如果Animal中没有name这个变量，则失败
        System.out.println(a.name);//动物


        //调用成员方法：编译看左边，运行看右边
        //编译看左边：javac编译代码的时候，会看左边的父类中有没有这个方法，如果有，编译成功，没有的话就编译失败
        //运行看右边：Java运行代码的时候，实际上运行的是子类中的方法
        a.show();

        /*
        理解：Animal a = new Dog();
        用a去调用变量和方法，而a是animal类型，所以默认从animal类中寻找

        成员变量：在子类的对象中，会把父类的成员变量也继承下来。父：name  子：name
        成员方法：如果子类对父类的方法进行了重写，那么在虚方法表中会把父类的方法覆盖，所以调用的是重写后的方法

        多态的对象只能调用重写的父类中之前存在的方法
        解决方法：变回子类类型  int b = 10; byte c = (byte)b;
        Dog d = (Dog)a
        不能瞎转，如果转成其他类的，可能会出错
        Cat d = (Cat)a  就会报错，因为a原来的右边是Dog类型的
        为防止出错，可以加判断

        if(a instanceof Dog){
          Dog d = (Dog)a;
        }else(a instanceof Cat){
          Cat d = (Cat)a;
        }else{
          sout("没有这个类型，无法转换")
        }

        //新特性
        先判断a是否为Dog类型，若是，则强转为Dog类型，转换后变量名为d
         if(a instanceof Dog d){
        }else(a instanceof Cat c){
        }else{
          sout("没有这个类型，无法转换")
        }
         */
    }

}

class Animal{
    String name ="动物";

    public void show(){
        System.out.println("Animal-----show");
    }
}

class Dog extends Animal{
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog-----show");
    }
}

class Cat extends Animal{
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat-----show");
    }
}
