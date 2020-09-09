package com.school.javacore.oop;

public class CircleDemo {

    public static void main(String[] args){
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0);

        System.out.println("radus "+circle1.getRadius()+" area "+circle1.getArea());
        System.out.println("radus "+circle2.getRadius()+" area "+circle2.getArea());

    }
}
