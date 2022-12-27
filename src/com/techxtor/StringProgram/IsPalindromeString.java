package com.techxtor.StringProgram;

public class IsPalindromeString {
    public static void main(String[] args) {
        String str = "EYES";
        if (isPalindrome(str)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        String reverseString = stringBuilder.reverse().toString();

        return str.equalsIgnoreCase(reverseString);
    }
}
