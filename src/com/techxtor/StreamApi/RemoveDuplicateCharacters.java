package com.techxtor.StreamApi;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String input = "proogrammingam";
        String result = removeDuplicateCharacters(input);
        System.out.println(result); // Output: "progamin"
    }

    public static String removeDuplicateCharacters(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
