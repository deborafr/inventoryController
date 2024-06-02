package com.example.vendingmachine.model;

public class Charger extends Product {

    private String specificType;
    private String company;

    public Charger(String id, String type, double price, String specificType, String company) {
        super(id, type, price);
        this.specificType = specificType;
        this.company = company;
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpecificType() {
        return specificType;
    }

    public void setSpecificType(String specificType) {
        this.specificType = specificType;
    }
}
