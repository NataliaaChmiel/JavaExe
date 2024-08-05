package com.griddynamics.nchmiel.javafundamentals.constructors;

class BookWithMultipleConstructors {
    public static void main(String s[]) {
        Book book1 = new Book("Java, The Complete Reference");
        Book book2 = new Book("Java, The Complete Reference", "Herbert Schildt");
        Book book3 = new Book("Java, The Complete Reference", "Herbert Schildt", 8);
        System.out.println("Book 1 = " + book1.name);
        System.out.println("Book 2 = " + book2.name + " - " + book2.author);
        System.out.println("Book 3 = " + book3.name + " - " + book3.author + " - " + book3.edition);

    }
}

class Book {
    String name;
    String author;
    int edition;

    // Constructor with name parameter
    public Book(String name) {
        this.name = name;
    }

    // Constructor with name and author parameters
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Constructor with name, author, and edition parameters
    public Book(String name, String author, int edition) {
        this.name = name;
        this.author = author;
        this.edition = edition;
    }
}