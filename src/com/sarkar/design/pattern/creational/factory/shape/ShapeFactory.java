package com.sarkar.design.pattern.creational.factory.shape;

public class ShapeFactory {
    Shape getShape(String input) {
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "TRIANGLE" -> new Triangle();
            default -> null;
        };
    }
}
