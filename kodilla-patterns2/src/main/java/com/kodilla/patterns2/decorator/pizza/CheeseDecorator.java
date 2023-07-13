package com.kodilla.patterns2.decorator.pizza;

public class CheeseDecorator extends AbstractPizzaOrderDecorator{
    public CheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " +extra cheese";
    }
}