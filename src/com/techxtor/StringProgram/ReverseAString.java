package com.techxtor.StringProgram;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Manish";

        System.out.println("Reversed word is : " + reverseWithoutUsingStringBuilder(str));
        System.out.println("Reversed word using StringBuilder is : " + reverseUsingStringBuilder(str));
    }

    static String reverseWithoutUsingStringBuilder(String str) {
        String reverseString = "";
        for (int i = 0; i < str.length(); i++) {
            // adds each character in front of the existing string
            reverseString = str.charAt(i) + reverseString;
        }
        return reverseString;

    }

    static String reverseUsingStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}

/*
 * Objects of String are immutable.
 * String class in Java does not have reverse() method, however, the StringBuilder class has built-in reverse() method.
 * StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method.
 * */
