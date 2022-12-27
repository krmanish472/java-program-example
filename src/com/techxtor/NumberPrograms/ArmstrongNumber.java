package com.techxtor.NumberPrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
//        125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
        int num = 125;
        if(checkForArmstrongNumber(num) == num){
            System.out.println("Armstrong");
        } else{
            System.out.println("not Armstrong");
        }
    }

    static int checkForArmstrongNumber(int num) {
        int numberOfdigit = 0;
        int countNum = num;
        while (countNum != 0) {
            countNum = countNum / 10;
            numberOfdigit++;
        }

        int output = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            output += Math.pow(lastdigit, numberOfdigit);
            num= num/10;
        }
        return output;

    }
}
