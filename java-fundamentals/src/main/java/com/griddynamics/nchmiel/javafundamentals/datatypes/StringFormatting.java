package com.griddynamics.nchmiel.javafundamentals.datatypes;

import java.util.Scanner;

class StringFormatting{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    // Define the regular expression pattern to match IP addresses
    String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
                     "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
