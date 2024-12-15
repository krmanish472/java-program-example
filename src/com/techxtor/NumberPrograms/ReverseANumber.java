package com.techxtor.NumberPrograms;

public class ReverseANumber {
    public static void main(String[] args) {
        reverseNumber(123);
    }

    // 123 => 321
    static void reverseNumber(int num) {
        System.out.println("Original Number: " + num);
        int revNum = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            revNum = revNum * 10 + lastdigit;
            num = num / 10;
        }
        System.out.println("Reversed Number: " + revNum);
    }
}
