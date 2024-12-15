package com.techxtor.Miscellaneous;

import java.util.*;

public class FrequencyOfNumberUsingListToSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A");

        // Store distinct elements so that it can be used in frequency
        Set<String> distinct = new HashSet<>(list);
        for(String s: distinct) {
            System.out.println(s + ": " + Collections.frequency(list, s));
        }
    }
}
