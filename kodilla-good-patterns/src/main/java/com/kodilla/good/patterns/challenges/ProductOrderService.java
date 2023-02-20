package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(User user, LocalDateTime orderDate, int productId, int quantity, double price) {
        System.out.println("New order details: \nUser: " + user.getName() + " " + user.getSurname() +
        "\nProduct ID:" + productId + "\nQuantity: " + quantity + "\nPrice: " + price +
                "\nTotal cost of order = " + price*quantity);
        return true;
    }
}
