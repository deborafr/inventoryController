package com.example.vendingmachine.model;

public class Battle extends Product {
    private String expDate;

    public Battle(String id, String type, double price, String expDate) {
        super(id, type, price);
        this.expDate = expDate;
    }

    public String getSExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}
