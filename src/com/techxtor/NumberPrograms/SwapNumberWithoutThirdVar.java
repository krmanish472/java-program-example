package com.techxtor.NumberPrograms;

public class SwapNumberWithoutThirdVar {
    public static void main(String[] args) {
        swapNumber(50, 60);
    }

    static void swapNumber(int n1, int n2) {
        System.out.println("Before Swap: " + n1 + " " + n2);
        n1 = n1 + n2; // 110
        n2 = n1 - n2; // 50
        n1 = n1 - n2; // 60
        System.out.println("Before Swap: " + n1 + " " + n2);
    }
}


// 50, 60
