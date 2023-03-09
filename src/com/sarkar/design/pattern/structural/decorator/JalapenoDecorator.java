package com.sarkar.design.pattern.structural.decorator;

public class JalapenoDecorator extends PizzaDecorator {

    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake() {
        return pizza.bake() + addJalapeno();
    }

    private String addJalapeno() {
        return "+ Jalapeno ";
    }
}
