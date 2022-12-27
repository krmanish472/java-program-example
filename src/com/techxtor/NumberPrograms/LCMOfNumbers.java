package com.techxtor.NumberPrograms;

public class LCMOfNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 60;
//        int num1 = 33, num2 = 40;
        int gcd = FindGCDofNumbers.findGCD(num1, num2);
        int lcm =  Math.abs(num1 * num2)/gcd;
        System.out.println(lcm);
    }
}
