package com.griddynamics.nchmiel.javafundamentals.interviewreview;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //Create Hashmap
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);

        System.out.println(myMap.get("Two"));
        System.out.println(myMap.containsKey("Three"));
        System.out.println(myMap.containsKey("One"));
        myMap.remove("One");
        System.out.println(myMap.containsKey("One"));

    }
}
