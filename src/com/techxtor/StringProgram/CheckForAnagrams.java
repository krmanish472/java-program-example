package com.techxtor.StringProgram;

import java.util.Arrays;

// if re arrangements of characters in string 1 will result in string 2 => its anagrams
public class CheckForAnagrams {
    public static void main(String[] args) {
        String str1 = "BRAG";
        String str2 = "RGAB";

        // converting both the arrays to character array
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        if (Arrays.equals(string1, string2)) {
            System.out.println("Both the strings are anagram");
        } else {
            System.out.println("Both the strings are not anagram");
        }
    }
}
