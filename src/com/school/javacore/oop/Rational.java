package com.school.javacore.oop;

public class Rational {
   //1. Define a class called Rational. A Rational object should have two
   // integer instance variables that store the numerator and denominator.

    private int numerator;
    private int denominator;
    private int sign;

    //2. Write a constructor that takes no arguments and that sets the numerator
    //to 0 and denominator to 1.

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }
    //7. Write a second constructor that takes two arguments and uses them to
    //    initialize the instance variables.
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getSign() {
        double result = (double) this.numerator / (double) this.denominator;

        return result < 0 ? -1 : 1;
    }
    //3. Write an instance method called printRational that displays a Rational
    //in some reasonable format.

    public void printRational(){
        System.out.println(this.numerator+" / "+this.denominator);
    }

    //6. Write a toString method for Rational and test it using println.
    @Override
    public String toString() {
        return numerator +" / "+ denominator;
    }

    public void negate(){
        this.sign = -1 * getSign();
    }
/*

8. Write an instance method called negate that reverses the sign of a ra-
    tional number. This method should be a modifier, so it should be void.
    Add lines to main to test the new method.
9. Write an instance method called invert that inverts the number by
    swapping the numerator and denominator. It should be a modifier. Add
    lines to main to test the new method.*/
}
