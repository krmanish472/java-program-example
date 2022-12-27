package com.techxtor.NumberPrograms;

public class ReverseANumber {
    public static void main(String[] args) {
        reverseNumber(12345);
    }

    static void reverseNumber(int num) {
        int orgNum = num; // just for printing
        int revNum = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            revNum = revNum * 10 + lastdigit;
            num = num / 10;
        }
        System.out.println("Reverse of " + orgNum + " is " + revNum);
    }
}
