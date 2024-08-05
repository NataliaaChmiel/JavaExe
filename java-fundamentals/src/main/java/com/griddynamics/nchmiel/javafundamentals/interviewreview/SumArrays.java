package com.griddynamics.nchmiel.javafundamentals.interviewreview;

public class SumArrays {
    public static double sum(double[] numbers) {

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum;
    }
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 5.5, 6, 7, 0.1};
        double result = sum(numbers);
        System.out.println("Sum of array is: " + result);
    }
}
