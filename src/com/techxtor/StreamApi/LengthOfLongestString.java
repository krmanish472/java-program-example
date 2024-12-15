package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LengthOfLongestString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Apple", "Kiwi", "Banana", "Grapes", "Apricot", "Avocado");

        Integer maxStringLength = str.stream()
                .map(String::length)
                .max(Comparator.comparing(String::valueOf))
                .get();

        System.out.println(maxStringLength);
    }
}
