package com.griddynamics.nchmiel.javafundamentals.operators;

//Task 1.
public class Precedence {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        System.out.println(x);//20
        System.out.println(y);//10

        double z = x++ - y * 7 / --y + x * 10;
        System.out.println(x);//21
        System.out.println(y);//9

        System.out.println(z);// 223.0 - final output
    }

}

//Task 2, 3.

//The range of values that can be represented by an int variable is
// from -2,147,483,648 to 2,147,483,647 (inclusive).
//The range of values that can be represented by a char variable is
// from '\u0000' (which represents the null character) to '\uffff'
// (which represents the Unicode maximum value), inclusive.

//Range of int: -2,147,483,648 to 2,147,483,647
//Range of char: '\u0000' to '\uffff' (0 to 65,535)