package com.griddynamics.nchmiel.javafundamentals.interviewreview;

public class SumWithoutHL {
    public static int sumWithoutHighestAndLowest(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        sum -= max;
        sum -= min;
        return sum;
    }
    public static void main(String[] args) {
        // Test cases
        int[] test1 = {6, 2, 1, 8, 10}; // 16
        int[] test2 = {1, 1, 11, 2, 3}; // 6
        int[] test3 = {}; // 0
        int[] test4 = {5}; // 0
        int[] test5 = {5, 5, 5, 5}; // 10

        System.out.println(sumWithoutHighestAndLowest(test1)); // Output: 16
        System.out.println(sumWithoutHighestAndLowest(test2)); // Output: 6
        System.out.println(sumWithoutHighestAndLowest(test3)); // Output: 0
        System.out.println(sumWithoutHighestAndLowest(test4)); // Output: 0
        System.out.println(sumWithoutHighestAndLowest(test5)); // Output: 10
    }

}
