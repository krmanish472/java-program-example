package com.techxtor.NumberPrograms;

public class SwapNumberWithThirdVar {
    public static void main(String[] args) {
        swapNumber(30, 40);
    }

    static void swapNumber(int num1, int num2){
        System.out.println("Before Swap: " + num1 + " " + num2);
        int temp = num1; //30
        num1 = num2; // 40
        num2 = temp; // 30
        System.out.println("After Swap: " + num1 + " " + num2);
    }
}
