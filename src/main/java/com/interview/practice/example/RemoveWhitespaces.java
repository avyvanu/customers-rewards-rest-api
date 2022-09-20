package com.interview.practice.example;

public class RemoveWhitespaces {


    public static void main(String[] args) {
        String str1 = " ancf sds 2323213   -dsdsd sds wew ";

        System.out.println(str1.trim().length());
        System.out.println(str1.length());

        StringBuffer sb = new StringBuffer();
        String split[] = str1.split(" ");
        for (String s : split){
            sb.append(s);
        }

        System.out.println("after removed white space : "+sb.toString().length());

        StringBuffer sb1 = new StringBuffer();
        char []ch = str1.toCharArray();
        for(int i =0; i<ch.length; i++){
            if(!Character.isWhitespace(ch[i])){
                sb1.append(ch[i]);
            }
        }
        System.out.println(sb1.toString().length());




    }
}
