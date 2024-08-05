package com.griddynamics.nchmiel.javafundamentals.classinheritence;

import java.util.Scanner;
abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    // Implementing the abstract method setTitle
    void setTitle(String s) {
        this.title = s;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of MyBook
        MyBook myBook = new MyBook();

        // Reading the title from input
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        scanner.close();

        // Setting the title using the setTitle method
        myBook.setTitle(title);

        // Printing the title
        System.out.println("The title is: " + myBook.getTitle());
        System.err.println("dupa");
    }
}