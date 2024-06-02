package com.example.vendingmachine.model;


public class Product {

    private final String id;
    private String type;
    private double price;

    public Product(String id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price +
                '}';
    }
}
