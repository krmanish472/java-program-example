package com.techxtor.NumberPrograms;

public class IsNumberPowerOfANumber {
    public static void main(String[] args) {
        if (isNumberPowerOfFour(32)) {
            System.out.println("Number is power of 4");
        } else {
            System.out.println("Number is not power of 4");
        }
    }

    // 64 => true
    // 32 => false

    static boolean isNumberPowerOfFour(int num) {
        while (num != 1) {
            if (num % 4 != 0) {
                return false;
            }
            num = num / 4;
        }
        return true;
    }
}
