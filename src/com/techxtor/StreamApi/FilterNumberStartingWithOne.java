package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 50, 30, 18, 29, 15, 37);
        List<Integer> list = numbers.stream()
                .map(str -> str + "")
                .filter(s -> s.startsWith("1"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        list.forEach(System.out::println);


    }
}
