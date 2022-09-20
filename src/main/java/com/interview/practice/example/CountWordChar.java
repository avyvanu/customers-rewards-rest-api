package com.interview.practice.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWordChar {

    public static void main(String[] args) {

        String s1 = "abcdc sharma vishnu shanjay akanksha";
        Map<Character, Integer> m = getWordFromString(s1);
        System.out.println(m);
        Set<Character> characters = m.keySet();

        for(Character ch : characters){

            System.out.println("Character : "+ch+ " has "+ m.get(ch)+ " counts");
        }
        String str = "abc";
        String str1 = "ABC";


        if(str.equals(str1) & str.equals(str1)){

        }
    }


    public static Map getWordFromString(String str) {

        Map<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }
        return map;
    }
}
