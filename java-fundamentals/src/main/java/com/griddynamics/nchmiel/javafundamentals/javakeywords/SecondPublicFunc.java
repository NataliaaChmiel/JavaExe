package com.griddynamics.nchmiel.javafundamentals.javakeywords;

//SecondPublicFunc accesses a public MainSecondPublicFunc class with public attributes:
class SecondPublicFunc {
    public static void main(String[] args) {
        MainSecondPublicFunc myObj = new MainSecondPublicFunc();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}