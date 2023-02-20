package com.kodilla.good.patterns.food2door;

public interface Manufacturer {
    OrderDto process(OrderRequest orderRequest);
    String getCompanyName();
    void firstOrderEver();
}
