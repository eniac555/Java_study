package com.itheima.a07oopextendsdemo7;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();

        System.out.println("---------------------");

        ChineseDog c = new ChineseDog();
        c.eat();
        c.drink();
        c.lookHome();

        System.out.println("---------------------");

        SharPei s = new SharPei();
        s.eat();
        s.drink();
        s.lookHome();
    }
}
