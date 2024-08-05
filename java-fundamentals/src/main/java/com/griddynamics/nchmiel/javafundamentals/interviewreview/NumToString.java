package com.griddynamics.nchmiel.javafundamentals.interviewreview;

public class NumToString {

    // Method to convert an integer to a string
    public static String convert(int num) {
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        // Test the convert method
        int number = 1234;
        String numberAsString = convert(number);

        // Print the result
        System.out.println("The number as a string is: " + numberAsString);
    }
}
