package com.techxtor.StreamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String sentence = "example sentence with some repeating characters";

        Map<Character, Long> frequencyMap = sentence.chars()
                .filter(c -> c != ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.entrySet().forEach(System.out::println);
    }
}
