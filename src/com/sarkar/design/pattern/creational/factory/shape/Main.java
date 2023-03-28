package com.sarkar.design.pattern.creational.factory.shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("CIRCLE");
        shape.draw();

    }
}
