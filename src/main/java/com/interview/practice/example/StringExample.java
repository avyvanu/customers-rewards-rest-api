package com.interview.practice.example;

public class StringExample {

    public static void main(String[] args) {
        // String reverse example 1
        String s ="";
        String str = "xyz  sharma ji";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        // String reverse example 2
        StringBuffer sb1 = new StringBuffer();

        char[] chars = str.toCharArray();
        for(int i = chars.length -1; i>=0; i--){
            sb1.append(chars[i]);
        }
        System.out.println(sb1.toString());
        char c;
        for(int i =0; i<str.length(); i++){

             c = str.charAt(i);
            s = c+s ;

        }
        System.out.println(s);
    }
}