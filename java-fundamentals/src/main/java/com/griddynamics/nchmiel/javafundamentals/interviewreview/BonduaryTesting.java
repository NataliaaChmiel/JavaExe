package com.griddynamics.nchmiel.javafundamentals.interviewreview;

public class BonduaryTesting {
    public static int y(int x) {
        return Math.abs(Math.abs(x - 5)- 5);
    }
    public static void main(String[] args) {
        //Boundary Values
        if (y(-25) != 25) throw new AssertionError("Test Case Failed: y(-25)");
        assert y(25) == 15 : "Test Case Failed: y(25)";

        if(y(-10) != 10) throw new AssertionError("Failed.");
        //Equivalence Classes
        if (y(-15) != 15) throw new AssertionError("Test Case Failed: y(-15)");
        assert y(15) == 5 : "Test Case Failed y(15)";
        assert y(0) == 0 : "Test Case Failed y(0)";
        assert y(10) == 0: "Test Case Failed y(10)";

        System.out.println("All test cases passed.");

    }
}
