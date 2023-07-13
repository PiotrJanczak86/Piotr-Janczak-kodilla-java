package com.kodilla.patterns2.decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public double getCost() {
        return 15.00;
    }

    @Override
    public String getDescription() {
        return "Your order: Margherita";
    }
}