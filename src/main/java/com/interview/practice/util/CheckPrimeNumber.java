package com.interview.practice.util;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        int flag = 0;
        int num = 30;
        for (int a = 0; a < 100; a++) {
            for (int i = 3; i < Math.sqrt(a); i += 2) {
                if (num % i == 0 || num % Math.sqrt(num) == 0) {
                    flag =  1;

                }
            }

            if(flag == 0){
                System.out.println("prime " + a);
            }


        }


    }
}
