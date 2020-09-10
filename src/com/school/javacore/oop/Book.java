package com.school.javacore.oop;

public class Book {

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    private int price;
    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice(String buyerType){
        if (buyerType == "student")
            return this.price * 40 /100;
        else
            return price;
    }
}
