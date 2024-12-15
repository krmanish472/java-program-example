package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectStringLengthInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Kiwi");

        List<Integer> lengthList = words.stream()
                .collect(Collectors.mapping(String::length, Collectors.toList()));

        System.out.println(lengthList);
    }
}
