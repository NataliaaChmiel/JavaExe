package com.griddynamics.nchmiel.javafundamentals.interviewreview;

class OppositeNum {
    private int a;
    private int b;

    public int getOppositeNum(int num) {
        // Sum of a and b
        int sum = a + b;
        // Return the opposite number
        return sum - num;
    }
    // Setters for a and b
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        OppositeNum test = new OppositeNum();

        // Test Case 1: Simple values
        test.setA(2);
        test.setB(3);
        System.out.println(test.getOppositeNum(2)); // Should print 3
        System.out.println(test.getOppositeNum(3));//2
}}
