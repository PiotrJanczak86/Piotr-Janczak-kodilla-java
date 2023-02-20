package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Manufacturer {

    private final String companyName = "ExtraFoodShop";
    static List<Product> stockEFS = new ArrayList<>();

    public void firstOrderEver() {
        if(stockEFS.isEmpty()) {
            initializeStock();
        }
    }

    public void initializeStock() {
        stockEFS.add(new Product("Soy Milk", 1111, 20, 5.99));
        stockEFS.add(new Product("Rice Milk", 1112, 20, 5.99));
        stockEFS.add(new Product("Coconut Milk", 1113, 20, 7.99));
    }

    public OrderDto process(OrderRequest orderRequest) {
        for (Product product : stockEFS) {
            if (product.getProductId() == orderRequest.getProductId()) {
                if(product.getQuantityInStock() >= orderRequest.getQuantity()) {
                    product.setQuantityInStock(product.getQuantityInStock() - orderRequest.getQuantity());
                    if (product.getQuantityInStock() < 10) {
                        System.out.println("Immediate restock needed. \n'sending mail to EFS HQ..'");
                    }
                    return new OrderDto(product.getPrice(),true);
                }
            }
        }
        return new OrderDto( 0.0,false);
    }
    public String getCompanyName(){
        return companyName;
    }
}