package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsInStringList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("My", "Name", "is", "Manish");
        String sentence = stringList.stream()
                .collect(Collectors.joining());

        System.out.println(sentence);

        String sentenceWithDelimiter = stringList.stream()
                .collect(Collectors.joining(" "));
        System.out.println(sentenceWithDelimiter);

        String sentenceWithPrefixSuffix = stringList.stream()
                .collect(Collectors.joining(" ", "<>", "!"));

        System.out.println(sentenceWithPrefixSuffix);

    }
}
