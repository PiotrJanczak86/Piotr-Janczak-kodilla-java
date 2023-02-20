package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    void makeOrder(User user, LocalDateTime orderDate, int productId, int quantity, double price);
}
