package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.List;

public class FilterNumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 50, 30, 18, 29, 15, 37);
        numbers.stream()
                .map(str -> str + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
