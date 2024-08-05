package com.griddynamics.nchmiel.javafundamentals.interviewreview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddCount {
    public static void main(String[] args) {

        Integer arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Initial Array: " + Arrays.toString(arr));

        List<Integer> arrList = new ArrayList<>(arr.length);
        for (int num : arr) {
            arrList.add(num);
        }

        List<Integer> oddList = new ArrayList<>();
        for (Integer num : arr) {
            if (num % 2 != 0){
                oddList.add(num);
            }
        }


        System.out.println("The amount of odd numbers equals: " + oddList.size());

    }
}
