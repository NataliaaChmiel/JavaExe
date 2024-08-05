package com.griddynamics.nchmiel.javafundamentals.interviewreview;

public class StringToNum {
    public static int StrToNum (String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String str = "1234";
        int number = StrToNum(str);
        System.out.println(number);
    }
}
