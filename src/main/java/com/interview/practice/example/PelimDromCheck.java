package com.interview.practice.example;

public class PelimDromCheck {

    public static void main(String[] args) {

        String str = "MAM";
        String str2 = "MADAM";
        String str3 = "ABC";

        System.out.println(checkPalindromeStringNormal(str2));
        System.out.println(checkPalindromeStringNormal(str3));


    }

    static boolean checkPalindromeString(String input) {
        StringBuffer sb = new StringBuffer();
        String str = sb.append(input).reverse().toString();
        return str.equals(input);

    }
    static boolean checkPalindromeStringNormal(String input) {

        boolean result = true;
        for(int i = 0; i<=input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length()-i-1)){
                result  = false;
                break;
            }
        }
        return result;
    }
}
