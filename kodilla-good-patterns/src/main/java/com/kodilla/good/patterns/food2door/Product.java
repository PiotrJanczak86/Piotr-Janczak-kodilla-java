package com.kodilla.good.patterns.food2door;

public class Product {
    private final String productName;
    private final int productId;
    private int quantityInStock;
    private double price;

    public Product(String productName, int productId, int quantityInStock, double price) {
        this.productName = productName;
        this.productId = productId;
        this.quantityInStock = quantityInStock;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}

