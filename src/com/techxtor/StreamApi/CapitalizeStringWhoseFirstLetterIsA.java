package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeStringWhoseFirstLetterIsA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Manish",
                "Shruti",
                "Amrita",
                "Ayush",
                "Parineeta"
        );
        List<String> updatedList = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        updatedList.forEach(System.out::println);
    }
}
