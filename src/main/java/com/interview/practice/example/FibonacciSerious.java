package com.interview.practice.example;


import java.util.ArrayList;
import java.util.List;

public class FibonacciSerious {

    public static void main(String[] args) {

        System.out.println(getFibonacciSerious(5));


        System.out.println("========");

        System.out.println(getFibonacciSeriousNormal(5));


    }

    public static int getFibonacciSerious(int number){
        if(number <= 1){
           return number;
        }
        return getFibonacciSerious(number -1) + getFibonacciSerious(number -2);
    }

    public static List<Integer> getFibonacciSeriousNormal(int number){

        int a = 0;
        int b = 1;
        int c = 1;
        List<Integer> aa = new ArrayList<>();
        for(int i = 1; i<=number; i++){
            aa.add(a);
            a = b;
            b = c;
            c =a+b;
        }
        return aa;

    }

}
