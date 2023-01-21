package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 30, 20, 50, 60, 20);

        List<Integer> duplicateNumbers = numbers.stream()
                .filter(number -> Collections.frequency(numbers, number) == 2)
                .collect(Collectors.toList());
        duplicateNumbers.forEach(System.out::println);

    }
}
