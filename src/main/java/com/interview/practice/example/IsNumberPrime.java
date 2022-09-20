package com.interview.practice.example;

public class IsNumberPrime {

    public static void main(String[] args) {

        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(19));
        System.out.println(isPrime(23));
        System.out.println(isPrime(27));
        System.out.println(isPrime(37));
        System.out.println(isPrime(49));

    }

    public static boolean isPrime(int prime){

        if(prime == 0 || prime == 1)
            return false;
        if(prime == 2)
            return true;
        for(int i =2; i<= prime/2; i++){
            if(1%2==0)
                return false;
        }
        return true;
    }
}
