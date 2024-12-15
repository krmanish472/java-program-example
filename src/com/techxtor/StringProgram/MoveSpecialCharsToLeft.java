package com.techxtor.StringProgram;

// You have write a function that accepts, a string which length is “len”, the string has some “#”,
// in it you have to move all the hashes to the front of the string and return the whole string back and print it.

import java.util.Arrays;

public class MoveSpecialCharsToLeft {
    public static void main(String[] args) {
        String str = "Move#Hash#to#Front"; // Output: ###MoveHashFront

        String str1 = "";
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#')
                str1 = str1 + str.charAt(i);
            else
                str2 = str2 + str.charAt(i);
        }
        String result = str1.concat(str2);
        System.out.println(result);
    }
}
