package com.sarkar.design.pattern.solid.singleresponsibility;

public class Invoice {

    private Marker marker; // Invoice has a relationship with Marker
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return marker.getPrice() * quantity;
    }

    // The below two methods violates the Single Responsibility Principle
    // because now this class is having multiple reasons to change other than CalculateTotal
    /*
    public void printInvoice() {
    }

    public void SaveToDB() {
    }
    */

}
