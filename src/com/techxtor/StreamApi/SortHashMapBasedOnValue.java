package com.techxtor.StreamApi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapBasedOnValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 3);
        map.put("b", 2);
        map.put("c", 4);
        map.put("d", 1);

        // {d=1, b=2, a=3, c=4}
        LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream()
                .sorted((e1, e2) -> e1.getValue() - e2.getValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMap);

        System.out.println();

        // {d=1, b=2, a=3, c=4}
        LinkedHashMap<String, Integer> sortedMapAlternateWay = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMapAlternateWay);
    }
}
