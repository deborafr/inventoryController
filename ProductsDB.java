package com.example.vendingmachine.DataBase;

import com.example.vendingmachine.model.Battle;
import com.example.vendingmachine.model.Charger;
import com.example.vendingmachine.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductsDB {

    private List<Product> products;

    public ProductsDB() {
        products = new ArrayList<Product>();

        products.add(new Battle("bc1", "coce", 10, "21.01.26"));
        products.add(new Battle("bc2","coce zero", 10, "21.01.26"));
        products.add(new Battle("bs1","sprite", 9, "21.01.26"));
        products.add(new Battle("bs2","sprite zero", 11, "21.02.26"));
        products.add(new Battle("bft1","fuze tea", 8, "21.02.26"));
        products.add(new Battle("bft2","fuze tea zero", 10, "21.02.26"));

        products.add(new Charger("cpAs", "phone charger", 10, "type A","samsung"));
        products.add(new Charger("cpBs", "phone charger", 10, "type B","samsung"));
        products.add(new Charger("clss","laptop charger", 10, "small laptop","samsung"));
        products.add(new Charger("clms","laptop charger", 10, "medium laptop","samsung"));
        products.add(new Charger("clls","laptop charger", 10, "large laptop","samsung"));
        products.add(new Charger("chrs","headphones charger", 9, "regular","samsung"));
        products.add(new Charger("cpAa","phone charger", 11, "type A","apple"));
        products.add(new Charger("cpBa","phone charger", 11, "type B","apple"));
        products.add(new Charger("clsa","laptop charger", 8, "small laptop","apple"));
        products.add(new Charger("clma","laptop charger", 8, "medium laptop","apple"));
        products.add(new Charger("clla","laptop charger", 8, "large laptop","apple"));
        products.add(new Charger("chra","headphones charger", 10, "regular","apple"));
    }

    //Return all the product from the DB (List)
    public List<Product> getProducts() {
        return products;
    }

    //Add a battle to the DB (List)
     public void addBattleToDB(Battle battle) {
        products.add(battle);
    }

    //Add a charger to the DB (List)
    public void addChargerToDB(Charger charger) {
        products.add(charger);
    }

    // Remove a product from the DB (List)
    public void removeProductFromDB(Product product) {
        products.remove(product);
    }


}
