package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop {

    private final String companyName = "GlutenFreeShop";
    static List<Product> stockGFS = new ArrayList<>();

    public void firstOrderEver() {
        if(stockGFS.isEmpty()) {
            initializeStock();
        }
    }

    public void initializeStock() {
        stockGFS.add(new Product("Gluten-Free Bread", 17, 20, 19.99));
        stockGFS.add(new Product("Gluten-Free Roll", 28, 20, 15.99));
        stockGFS.add(new Product("Gluten-Free Pasta", 44, 20, 17.99));
    }

    public OrderDto process(OrderRequest orderRequest) {
        for (Product product : stockGFS) {
            if (product.getProductId() == orderRequest.getProductId()) {
                if(product.getQuantityInStock() >= orderRequest.getQuantity()) {
                    product.setQuantityInStock(product.getQuantityInStock() - orderRequest.getQuantity());
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
