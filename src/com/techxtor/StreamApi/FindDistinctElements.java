package com.techxtor.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindDistinctElements {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2, 5, 6, 7, 3, 2, 7, 1, 8, 7);
        List<Integer> distinct = li.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);

        int[] nums = new int[] {2, 5, 6, 7, 3, 2, 7, 1, 8, 7};
        List<Integer> list = Arrays.stream(nums).boxed().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}