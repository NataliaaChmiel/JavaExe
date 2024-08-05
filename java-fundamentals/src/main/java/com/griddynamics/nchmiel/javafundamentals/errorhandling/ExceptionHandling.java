package com.griddynamics.nchmiel.javafundamentals.errorhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("/ by zero");
            }
            int result = num1 / num2;
            System.out.println(result);

        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
