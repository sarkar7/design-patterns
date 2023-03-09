package com.sarkar.design.pattern.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Pizza basePizza = new BasePizza();
        Pizza jalapeno = new JalapenoDecorator(basePizza);
        Pizza cheeseBurst = new CheeseBurstDecorator(jalapeno);

        System.out.println(cheeseBurst.bake());

    }

}
