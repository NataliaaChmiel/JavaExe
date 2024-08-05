package com.griddynamics.nchmiel.javafundamentals.looping;


import java.util.Random;

//Task 5. Finding a maximum value in array of 100 integers
public class LoopOfSumming {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101); // Generating random integers from 0 to 100
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) { //Iterating through array and looking for the biggest num
                max = array[i];
            }
        }
        System.out.print("Maximum value in array is:" + max);
    }

}
