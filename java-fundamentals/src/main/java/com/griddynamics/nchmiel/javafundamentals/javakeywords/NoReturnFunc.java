package com.griddynamics.nchmiel.javafundamentals.javakeywords;

//The void keyword specifies that a method should not have a return value.

public class NoReturnFunc {
    static void myMethod() { //not returning
        System.out.println("I just got executed!"); //just printing
    }

    public static void main(String[] args) {
        myMethod();
    }
}