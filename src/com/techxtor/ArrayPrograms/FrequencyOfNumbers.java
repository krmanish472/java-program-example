package com.techxtor.ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        Map<Integer, Integer> integerFrequency = new HashMap<>();
        for (int num : arr) {
            if (!integerFrequency.containsKey(num)) {
                integerFrequency.put(num, 1);
            } else {
                int count = integerFrequency.get(num);
                integerFrequency.put(num, count + 1);
            }
        }
        System.out.println(integerFrequency);
    }
}
