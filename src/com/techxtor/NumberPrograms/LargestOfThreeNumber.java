package com.techxtor.NumberPrograms;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        findLargestNumber(40, 78, 19);
    }
    static void findLargestNumber(int a, int b, int c){
        if(a>=b && a>=c){
            System.out.println("Largest is " + a);
        } else if(b>=a && b>=c){
            System.out.println("Largest is " + b);
        } else {
            System.out.println("Largest is " + c);
        }
    }
}
