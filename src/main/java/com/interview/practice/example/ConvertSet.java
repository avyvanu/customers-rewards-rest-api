package com.interview.practice.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertSet {


    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,3,1,4,2,5,6,8,5,45,34,43,23,34,65,65,76,87,87,756,4);

        Set<Integer> set = integerList.stream().collect(Collectors.toSet());

        System.out.println(set);

        set.add(5);

        System.out.println(set);


    }
}
