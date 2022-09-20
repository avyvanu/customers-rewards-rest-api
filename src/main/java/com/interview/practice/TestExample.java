package com.interview.practice;

import java.util.HashMap;
import java.util.Map;

public class TestExample {
    public static void main(String[] arge) {
        int[] arr = {51, 71, 17, 41};
        System.out.println(maximumSum(arr));
    }

    public static int maximumSum(int[] a) {

        Map<Integer, Integer> m = new HashMap<>();

        Integer output = 93;
        Integer ans = 0;

        for (Integer i = 0; i < a.length; i++) {

            Integer b = output - a[i];
            System.out.println(b);


            if (m.containsKey(b)) {
                ans += m.put(b, 1);
            }
            m.put(a[i], i+1);


        }
        return ans;

    }
}