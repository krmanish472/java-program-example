package com.techxtor.NumberPrograms;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 4, 7, 9, 2, 3};

        int secondHighestNum = findSecondHighest(arr);
        System.out.println("Second Highest Num: " + secondHighestNum);

        int secondLowestNum = findSecondLowest(arr);
        System.out.println("Second Lowest Num: " + secondLowestNum);
    }

    static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }

    static int findSecondLowest(int[] arr){
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        for (int i: arr){
            if(i<lowest){
                secondLowest = lowest;
                lowest = i;
            } else if(i<secondLowest){
                secondLowest = i;
            }
        }
        return secondLowest;
    }
}
