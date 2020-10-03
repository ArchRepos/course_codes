package com.school.javacore.oop.interfaces;

public class Book extends Thing implements Sellable, Comparable<Book> {

    private String name;
    private Person author;
    private int numberPages;

    public Book(String name, Person author, int numberPages) {
        this.name = name;
        this.author = author;
        this.numberPages = numberPages;
    }

    @Override
    public Double givePrice() {
        return numberPages * 10.0;
    }

    @Override
    public int compareTo(Book book) {
        return 0;
    }


}
