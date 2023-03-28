package com.sarkar.design.pattern.solid.singleresponsibility;

public class InvoiceDao {

    private Invoice invoice; // InvoiceDao has a relationship with Invoice class

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void SaveToDB() {
    }

    // This method violates open-close principle
    /*
        public void SaveToFile() {
        }
    */
}
