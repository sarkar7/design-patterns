package com.sarkar.design.pattern.structural.decorator;

public class BasePizza implements Pizza {
    @Override
    public String bake() {
        return "Base Pizza ";
    }
}
