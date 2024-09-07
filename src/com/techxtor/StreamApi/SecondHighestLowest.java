package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestLowest {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int secondHighestNum = li.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .get();

        int secondLowestNum = li.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondLowestNum + " " + secondHighestNum);
    }
}
