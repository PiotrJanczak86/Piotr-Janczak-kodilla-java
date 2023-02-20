package com.kodilla.good.patterns.food2door;

public class OrderRetriever {
    public OrderRequest retrieve() {
        int productId = 1111;
        int quantity = 7;
        Manufacturer manufacturer = new ExtraFoodShop();
        return new OrderRequest(manufacturer, productId, quantity);
    }
}
