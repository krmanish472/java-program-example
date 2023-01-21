package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 10, 30, 20, 50, 60, 20);

        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        Set<Map.Entry<Integer, Long>> mapSet = frequencyMap.entrySet();

        for (Map.Entry<Integer, Long> entry: mapSet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
