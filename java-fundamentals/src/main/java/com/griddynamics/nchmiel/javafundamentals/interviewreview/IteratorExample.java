package com.griddynamics.nchmiel.javafundamentals.interviewreview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);

            if (element.equals("Two")) {
                iterator.remove();
            }
        }

    }
}
