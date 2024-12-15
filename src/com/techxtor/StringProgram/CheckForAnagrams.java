package com.techxtor.StringProgram;

import java.util.Arrays;

// if re-arrangements of characters in string_1 will result in string_2 => its anagrams
public class CheckForAnagrams {
    public static void main(String[] args) {
        String str1 = "BRAG";
        String str2 = "RGAB";

        // converting both the arrays to character array
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        if (areArraysEquals(string1, string2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagram");
        }

        /** OR ...
         if (Arrays.equals(string1, string2)) {
         System.out.println("Both the strings are anagram");
         } else {
         System.out.println("Both the strings are not anagram");
         }
         */
    }

    static boolean areArraysEquals(char[] string1, char[] string2) {
        for (int i = 0; i < string1.length; i++) {
            if (string1[i] != string2[i]) {
                return false;
            }
        }
        return true;
    }
}
