package com.kodilla.patterns2.decorator.taxiportal;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PizzaOrderTestSuite {

    @Test
    public void BasicPizzaOrderPriceTest(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        double price = pizzaOrder.getCost();
        //Then
        assertEquals(15.0, price);
    }
    @Test
    public void BasicPizzaOrderDescriptionTest(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Your order: Margherita", description);
    }
    @Test
    public void PizzaWithHamOrderPriceTest() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        double price = pizzaOrder.getCost();
        //Then
        assertEquals(18.0, price);
    }
    @Test
    public void PizzaWithHamOrderDescriptionTest(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Your order: Margherita +ham", description);
    }
    @Test
    public void PizzaWithAddonsOrderPriceTest(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        //When
        double price = pizzaOrder.getCost();
        //Then
        assertEquals(23.50, price);
    }
    @Test
    public void PizzaWithAddonsOrderDescriptionTest(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Your order: Margherita +extra cheese +ham +mushrooms", description);
    }
}