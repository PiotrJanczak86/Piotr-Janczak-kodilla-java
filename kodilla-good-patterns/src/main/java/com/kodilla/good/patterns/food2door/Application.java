package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRetriever().retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(orderRequest);
        orderProcessor.orderProcess();

    }
}
