package com.techxtor.InterviewQue;

import java.util.*;

public class FindSpecialDigitsSumFactorial {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2);
        int sum = 0; // 5
        for (Integer num : nums) {
            sum += num;
        }

        int fact = 1; // 120
        while(sum >0){
            fact*=sum;
            sum--;
        }
        System.out.println(fact);

        Set<Integer> result = new TreeSet<>();
        while (fact > 0) { // 120 > 0
            for (Integer num : nums) {
                if (num == fact % 10) {
                    result.add(num);
                }
            }
            fact = fact / 10;
        }
        System.out.println(result.size());
    }
}
