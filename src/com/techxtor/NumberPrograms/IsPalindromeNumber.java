package com.techxtor.NumberPrograms;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        isPalindromeNum(1221); ///palindrome
        isPalindromeNum(1222); ///not palindrome
    }

    static void isPalindromeNum(int num) {
        int orgNum = num;

        // reverse a number
        int revNum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            revNum = revNum * 10 + lastDigit;
            num = num / 10;
        }

        if (revNum == orgNum) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
