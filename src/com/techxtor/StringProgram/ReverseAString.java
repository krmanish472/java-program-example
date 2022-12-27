package com.techxtor.StringProgram;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "dalai";

        System.out.println("Reversed word is : " + reverseWithoutUsingStringBuilder(str));
        System.out.println("Reversed word using StringBuilder is : " + reverseUsingStringBuilder(str));
    }

    static String reverseWithoutUsingStringBuilder(String str) {
        String reverseString = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            // adds each character in front of the existing string
            reverseString = ch + reverseString;
        }
        return reverseString;

    }

    static String reverseUsingStringBuilder(String str) {
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        return input1.reverse().toString();
    }
}

/*
 * Objects of String are immutable.
 * String class in Java does not have reverse() method, however, the StringBuilder class has built-in reverse() method.
 * StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method.
 * */
