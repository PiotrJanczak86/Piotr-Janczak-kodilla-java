package com.kodilla.patterns2.decorator.pizza;

public class MushroomsDecorator extends AbstractPizzaOrderDecorator{

    public MushroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost(){
        return super.getCost() + 2.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " +mushrooms";
    }
}