package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacterLengthInStringList {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("apple", "banana", "pear");
        Map<Integer, List<String>> map = li.stream()
                .collect(Collectors.groupingBy(String::length));

        li.stream()
                        .forEach(e-> System.out.println(e + ' ' + e.length()));

//        System.out.println(map);
    }
}
