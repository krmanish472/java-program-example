package com.techxtor.StreamApi;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 5, 7);
        int sum = integers.stream().reduce(0, (a,b) -> a+b) ;
        System.out.println(sum);
    }
}
