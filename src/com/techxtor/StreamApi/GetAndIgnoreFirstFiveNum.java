package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetAndIgnoreFirstFiveNum {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> getFirst5 = li.stream().limit(5).collect(Collectors.toList());
        System.out.println(getFirst5);

        List<Integer> ignoreFirst5 = li.stream().skip(5).collect(Collectors.toList());
        System.out.println(ignoreFirst5);
    }
}
