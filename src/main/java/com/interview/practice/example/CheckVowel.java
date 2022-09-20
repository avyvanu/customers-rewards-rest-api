package com.interview.practice.example;

public class CheckVowel {

    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "CBD";
        String s3 = "CBaD";

        System.out.println(s.toLowerCase().matches(".*[aeiou].*"));
        System.out.println(s1.toLowerCase().matches(".*[aeiou].*"));
        System.out.println(s3.toLowerCase().matches(".*[aeiou].*"));
    }
}
