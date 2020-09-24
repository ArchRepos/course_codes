package com.school.javacore.oop.inheritance;

public class Appetizer extends Food {
    public Appetizer(String name, String ingredients, double price) {
        super(name, ingredients, price);
    }

    @Override
    public String toString() {
        return "Appetizer{} " + super.toString();
    }
}
