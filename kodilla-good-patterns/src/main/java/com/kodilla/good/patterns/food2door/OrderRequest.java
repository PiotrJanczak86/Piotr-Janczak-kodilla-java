package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private final Manufacturer manufacturer;
    private final int productId;
    private final int quantity;

    public OrderRequest(Manufacturer manufacturer, int productId, int quantity) {
        this.manufacturer = manufacturer;
        this.productId = productId;
        this.quantity = quantity;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}
