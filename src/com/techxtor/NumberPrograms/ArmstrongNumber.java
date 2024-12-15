package com.techxtor.NumberPrograms;

public class ArmstrongNumber {

    // 153: 3^3 + 5^3 + 1^3 = 153
    // 125: 13 + 23 + 53 = 134 (Not an Armstrong Number)
    public static void main(String[] args) {
        int num = 153;
        int length = countNumLength(153);
        if(calculateArmstrongSum(num, length) == num){
            System.out.println("Armstrong");
        } else{
            System.out.println("Not Armstrong");
        }
    }

    static int countNumLength(int num){
        int numberOfdigit = 0;
        while (num != 0) {
            num = num / 10;
            numberOfdigit++;
        }
        return  numberOfdigit;
    }

    // calculate -- 5^3 + 2^3 + 1^3
    static int calculateArmstrongSum(int num, int length) {
        int output = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            output += (int) Math.pow(lastdigit, length);
            num= num/10;
        }
        return output;
    }
}
