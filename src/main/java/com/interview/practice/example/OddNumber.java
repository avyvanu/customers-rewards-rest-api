package com.interview.practice.example;


import java.util.Arrays;
import java.util.List;

public class OddNumber {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1, 3, 5, 9);
        System.out.println(findOddNumber(l));
    }
    private static Boolean findOddNumber(List<Integer> listNumber) {

        // Integer s = listNumber.stream().filter(x -> x% 2 != 0).findFirst().get();
        for (Integer i : listNumber) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }
}
