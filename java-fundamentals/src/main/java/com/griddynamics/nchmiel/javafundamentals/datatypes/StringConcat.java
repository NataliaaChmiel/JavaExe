package com.griddynamics.nchmiel.javafundamentals.datatypes;

public class StringConcat {
    String hi = "Hi, ";
    String mom = "guys.";
    String mergedString = hi + mom;

    String hello = "Hello, ";
    String people = "my friends.";

    public static void main(String[] args) {
        StringConcat stringConcat = new StringConcat();
        System.out.println(stringConcat.mergedString);
        System.out.println(stringConcat.hello + stringConcat.people);
    }
}

