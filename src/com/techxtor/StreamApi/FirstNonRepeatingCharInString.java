package com.techxtor.StreamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharInString {

    public static void main(String[] args) {
        String input = "swiss";
        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) // Keep only entries with frequency 1
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(result);
    }
}


