package com.techxtor.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class NTHHighestSalary {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>(){{
            put("Manish", 1200);
            put("Shruti", 1300);
            put("Rajee", 1300);
            put("Shweta", 900);
            put("Sharanu", 1200);
            put("Janaki", 1500);
        }};

        Map.Entry<String, Integer> secHighestSalary = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .get(1);

        System.out.println(secHighestSalary);

        // ... or ... //
        Map.Entry<Integer, List<String>> res = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .get(1);

        System.out.println(res);
    }
}
