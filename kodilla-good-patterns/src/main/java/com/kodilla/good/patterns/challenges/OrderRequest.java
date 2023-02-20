package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private final User user;
    private final LocalDateTime orderDate;
    private final int productId;
    private final int quantity;
    private final double price;

    public OrderRequest(User user, LocalDateTime orderDate, int productId, int quantity, double price) {
        this.user = user;
        this.orderDate = orderDate;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
