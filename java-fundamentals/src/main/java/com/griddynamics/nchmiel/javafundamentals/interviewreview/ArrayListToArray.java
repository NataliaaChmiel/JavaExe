package com.griddynamics.nchmiel.javafundamentals.interviewreview;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        //Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");

        System.out.println(arrayList);

        //Convert ArrayList to Array
        Object[] array = arrayList.toArray();

        for (Object element : array){
            System.out.println(element);
        }
    }
}
