package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Manufacturer {

    private final String companyName = "HealthyShop";
    static List<Product> stockHS = new ArrayList<>();

    public void firstOrderEver() {
        if (stockHS.isEmpty()) {
            initializeStock();
        }
    }

    public void initializeStock() {
        stockHS.add(new Product("Kale Smoothie", 771, 99, 10.00));
        stockHS.add(new Product("Broccoli Smoothie", 432, 99, 11.00));

    }

    public OrderDto process(OrderRequest orderRequest) {
        double specialOffer = 1.0;
        for (Product product : stockHS) {
            if (product.getProductId() == orderRequest.getProductId()) {
                if (product.getQuantityInStock() >= orderRequest.getQuantity()) {
                    product.setQuantityInStock(product.getQuantityInStock() - orderRequest.getQuantity());
                    if (orderRequest.getQuantity() > 10) {
                        specialOffer = 0.9;}
                    return new OrderDto(product.getPrice() * specialOffer, true);
                }
            }
        }
        return new OrderDto(0.0, false);
    }
    public String getCompanyName(){
        return companyName;
    }
}