package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMin {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(4, 5, 8, 7, 10, 15, 39, 11, 23);
        int max = li.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        int min = li.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println(min + " " + max);
    }
}
