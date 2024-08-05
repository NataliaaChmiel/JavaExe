package com.griddynamics.nchmiel.javafundamentals.constructors;

class Tricky {
    int num;
    Tricky(int n) {
        num = n;
    }
    Tricky inc() {
        Tricky temp = new Tricky(num + 10);
        return temp;
    }
}

public class TrickyQuestion {
    public static void main(String s[]) {
        Tricky num1 = new Tricky(10);
        Tricky num2;
        num2 = num1.inc();
        System.out.print("The program will display the output as: ");
        System.out.print(num1.num + ",");
        System.out.print(num2.num + ",");
        num2 = num1.inc();
        System.out.print(num2.num);
    }
}