package com.interview.practice.example;

public class SwapNumber {

    public static void main(String[] args) {


        int a =25;
        int b=35;

        System.out.println("Before");
        System.out.println(a);
        System.out.println(b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After");
        System.out.println(a);
        System.out.println(b);


    }
}
