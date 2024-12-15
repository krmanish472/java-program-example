package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStatistics {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5);
        IntSummaryStatistics statistics = li.stream()
                .collect(Collectors.summarizingInt(Integer::valueOf));

        System.out.println(statistics);
    }
}
