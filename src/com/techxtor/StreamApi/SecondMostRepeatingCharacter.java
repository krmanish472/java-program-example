package com.techxtor.StreamApi;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMostRepeatingCharacter {
    public static void main(String[] args) {
        String input = "programming";
        findSecondMostFrequentCharacter(input);
    }

    private static void findSecondMostFrequentCharacter(String input) {
        Map<Character, Long> freqMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));


        freqMap.entrySet().forEach(System.out::println);
    }
}
