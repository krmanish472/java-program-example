package com.techxtor.StreamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfNumbersAndSquareAndSort {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        List<Integer> integers = Arrays.asList(0, 4, 0, 1, 4, 5, 5, 5, 3, 4, 4, 3, 2, 3, 2, 3, 2, 4, 4, 5, 5, 5, 5, 5);
        integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(e -> li.add((int) (e.getValue() * e.getValue())));

        Collections.sort(li);
        System.out.println(li);
    }
}
