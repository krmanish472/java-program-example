package com.techxtor.StreamApi;

import java.util.HashMap;
import java.util.Map;

public class GetHashMapMaxValue {

    public static void main(String[] args) {
        Map<Integer, Integer> integerFrequency = new HashMap<>() {{
            put(1, 2);
            put(2, 4);
            put(8, 2);
            put(3, 1);
            put(5, 1);
        }};

        Integer maxValue = integerFrequency.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getValue();

        System.out.println(maxValue);
    }
}
