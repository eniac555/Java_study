package com.itheima.a01mathdemo1;

public class MathDemo2 {
    public static void main(String[] args) {
        System.out.println(isPrime(997));
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            if (isPrime(i)){
                System.out.println(i);

            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);




    }

    public static boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}


