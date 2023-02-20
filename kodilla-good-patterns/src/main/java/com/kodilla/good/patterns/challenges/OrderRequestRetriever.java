package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Peter", "Green");
        LocalDateTime orderDate = LocalDateTime.of(2023, 2, 20, 8, 0);
        int productId = 54267;
        int quantity = 5;
        double price = 99.99;
        return new OrderRequest(user, orderDate, productId, quantity, price);
    }
}
