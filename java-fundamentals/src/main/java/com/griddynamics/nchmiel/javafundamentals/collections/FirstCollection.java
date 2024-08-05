package com.griddynamics.nchmiel.javafundamentals.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FirstCollection {
    public static void main(String[] args) {
        Collection<Integer> myItems = new ArrayList<>();
        myItems.add(9);
        myItems.add(1);
        myItems.add(1);
        myItems.add(6);
        myItems.add(6);


        Iterator<Integer> iterator = myItems.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}