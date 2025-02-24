package com.wipro.microservices.l;

public class MainApp {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        // Create a Square object
        Square square = new Square(4);
        System.out.println("Square Area: " + square.getArea());

        // Testing Liskov Substitution
        rectangle.setWidth(8);
        rectangle.setHeight(6);
        System.out.println("Updated Rectangle Area: " + rectangle.getArea());

        square.setWidth(5);
        System.out.println("Updated Square Area: " + square.getArea());
    }
}
