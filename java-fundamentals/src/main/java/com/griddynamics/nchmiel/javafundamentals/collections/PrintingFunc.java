package com.griddynamics.nchmiel.javafundamentals.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrintingFunc {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();//<String>
        list1.add("1");
        list1.add("2");
        list1.add(1, "3");
        List<String> list2 = new LinkedList<>(list1);//<String>
        list1.addAll(list2);
        list2 = list1.subList(2, 5);
        list2.clear();
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1);



    }
}

//[1, 3, 2] -> output
