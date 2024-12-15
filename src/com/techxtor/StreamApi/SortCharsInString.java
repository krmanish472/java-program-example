package com.techxtor.StreamApi;

import java.util.stream.Collectors;

public class SortCharsInString {
    public static void main(String[] args) {
        String str = "MANISH";
        String sortedString = str.chars()
                .mapToObj(c -> (char) c)
                .sorted(Character::compareTo)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(sortedString);
    }
}
