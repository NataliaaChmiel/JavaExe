package com.griddynamics.nchmiel.javafundamentals.interviewreview;

public class BlackBoxIf {
    public int IfFunction(int a, int b){
        if (a < 30){
            return 100 / (a + 10);
        } else if (a > b) {
            return b;
        } else if (a * 10 < b) {
            return b - 100;
        } else return b;
    }

    public static void main(String[] args){
        BlackBoxIf blackBox = new BlackBoxIf();
        int result;

        //1
        result = blackBox.IfFunction(0, 50);
        System.out.println("1: " + result);

        result = blackBox.IfFunction(-128, 0);
        System.out.println("2: " + result);

        result = blackBox.IfFunction(50, 50);
        System.out.println("3: " + result);

        result = blackBox.IfFunction(128, 129);
        System.out.println("4: " + result);
    }
}
