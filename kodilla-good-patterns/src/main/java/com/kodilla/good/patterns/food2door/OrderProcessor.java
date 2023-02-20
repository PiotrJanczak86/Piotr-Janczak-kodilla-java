package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    private final OrderRequest orderRequest;
    private final Manufacturer manufacturer;

    public OrderProcessor(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
        this.manufacturer = orderRequest.getManufacturer();
        manufacturer.firstOrderEver();
    }

    public void orderProcess() {
        OrderDto orderDto = manufacturer.process(orderRequest);
        if (orderDto.isInStock()) {
            System.out.println("Thank you for your purchase from " + manufacturer.getCompanyName() +"!\nYour total cost is: "
                    + orderRequest.getQuantity() * orderDto.getPrice()+"$");
        } else {
            System.out.println("Not enough items in stock. Please try again later or change your order");
        }
    }
}
