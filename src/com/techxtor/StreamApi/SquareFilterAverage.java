package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SquareFilterAverage {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        double res = li.stream()
                .map(e -> e * e)
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
        System.out.println(res);
    }
}
