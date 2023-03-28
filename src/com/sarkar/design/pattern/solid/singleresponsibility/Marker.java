package com.sarkar.design.pattern.solid.singleresponsibility;


public class Marker {
    private String name;
    private String color;
    private int year;
    private double price;

    public Marker(String name, String color, int year, double price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
