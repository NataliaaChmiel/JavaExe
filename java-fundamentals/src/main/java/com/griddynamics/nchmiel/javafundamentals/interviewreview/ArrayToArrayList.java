package com.griddynamics.nchmiel.javafundamentals.interviewreview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] myArray = {"One", "Two", "Three"};

        //Convert to AL
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(myArray));

        for(String element : arrList) {
            System.out.println(element);
        }
    }
}
