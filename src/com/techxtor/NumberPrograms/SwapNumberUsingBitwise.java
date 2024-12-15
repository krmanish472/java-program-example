package com.techxtor.NumberPrograms;

public class SwapNumberUsingBitwise {
    public static void main(String[] args) {
        swapNumber(30, 50);
    }

    static void swapNumber(int num1, int num2) {
        System.out.println("Before Swap: " + num1 + " " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After Swap: " + num1 + " " + num2);
    }
}
