package com.techxtor.NumberPrograms;

public class FindGCDofNumbers {
    public static void main(String[] args) {
        System.out.println("GCD is " + findGCD(50, 60));
        System.out.println("GCD is " + findGCD(33, 40));
    }

    static int findGCD(int num1, int num2){
        while (num1 != num2){
            if(num1>num2){
                num1 = num1 - num2;
            } else{
                num2 = num2 - num1;
            }
        }
        return num2;
    }
}
