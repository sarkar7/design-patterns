package com.sarkar.design.pattern.structural.decorator;

public class CheeseBurstDecorator extends PizzaDecorator {

    public CheeseBurstDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake() {
        return pizza.bake() + addCheeseBurst();
    }

    private String addCheeseBurst() {
        return "+ Cheese ";
    }
}
