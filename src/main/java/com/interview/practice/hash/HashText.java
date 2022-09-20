package com.interview.practice.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static java.security.MessageDigest.getInstance;

public class HashText {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        System.out.println(sh1("Hello World"));
    }

    public static String sh1(String input) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = getInstance("SHA1");

        byte[] result = messageDigest.digest(input.getBytes());

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<result.length; i++){
            //sb.append(result[i]);
            sb.append(Integer.toString((result[i] & 0xff ) + 0x100, 16).substring(1));

        }

        return sb.toString();
    }
}