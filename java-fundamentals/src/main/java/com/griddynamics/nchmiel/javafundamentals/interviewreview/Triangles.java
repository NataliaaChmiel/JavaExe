package com.griddynamics.nchmiel.javafundamentals.interviewreview;

public class Triangles {
    private double side1;
    private double side2;
    private double side3;

    public Triangles(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getParam() {
        return side1 + side2 + side3;
    }

    public String getType() {
        if (isEquilateral()) {
            return "Equilateral";
        } else if (isIsosceles()) {
            return "Isosceles";
        } else if (isRightAngled()) {
            return "Right-Angled";
        } else {
            return "Scalene";
        }
    }
    private boolean isEquilateral() {
        return side1 == side2 && side3 == side2;
    }
    private boolean isIsosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }
    private boolean isRightAngled() {
        double a = Math.pow(side1, 2);
        double b = Math.pow(side2, 2);
        double c = Math.pow(side3, 2);
        return (a + b == c) || (a + c == b) || (b + c == a);
    }

    public static void main(String[] args) {
        //Test cases
        Triangles t1 = new Triangles(3,3,4);
        System.out.println("Triangle 1: Type = " + t1.getType() + ", Param = " + t1.getParam());
        Triangles t2 = new Triangles(3,4,5);
        System.out.println("Triangle t2: Type = " + t2.getType() + ", Param = " + t2.getParam());
        Triangles t3 = new Triangles(3,3,3);
        System.out.println("Triangle t3: Type = " + t3.getType() + ", Param = " + t3.getParam());

    }
}
