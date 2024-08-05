package com.griddynamics.nchmiel.javafundamentals.operators;

public class IncreasingOrder {
    //Order the following in the increasing order of the byte size:
    //byte
    //int
    //long
    //++char

    public static void main(String[] args) {
        String oneByte = "byte have 8 bits which equals to 1 byte";
        String oneChar = "++char have 16 bits which equals to 2 bytes";
        String oneInt = "int have 32 bits which equals to 4 bytes";
        String oneLong = "long got 65 bits which equals to 8 bytes";

        String correctOrder = "correct order: byte, ++char, int, long";

        System.out.println(oneByte);
        System.out.println(oneChar);
        System.out.println(oneInt);
        System.out.println(oneLong);
        System.out.println(correctOrder);
    }
}
