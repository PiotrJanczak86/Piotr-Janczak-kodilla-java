package com.kodilla.good.patterns.food2door;

public class OrderDto {
    private double price;
    private boolean inStock;

    public OrderDto(double price, boolean inStock) {
        this.price = price;
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }
}
