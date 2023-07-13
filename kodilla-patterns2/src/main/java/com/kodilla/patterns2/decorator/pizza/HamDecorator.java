package com.kodilla.patterns2.decorator.pizza;

public class HamDecorator extends AbstractPizzaOrderDecorator {
    public HamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " +ham";
    }
}