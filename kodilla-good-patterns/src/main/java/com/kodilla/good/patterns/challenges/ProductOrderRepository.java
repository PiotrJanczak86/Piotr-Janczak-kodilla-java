package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    public void makeOrder(User user, LocalDateTime orderDate, int productId, int quantity, double price){
        System.out.println("New order successfully added.");
    }
}
