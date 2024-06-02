package com.example.vendingmachine.service;

import com.example.vendingmachine.DataBase.ProductsDB;
import com.example.vendingmachine.model.Battle;
import com.example.vendingmachine.model.Charger;
import com.example.vendingmachine.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    ProductsDB productsDB = new ProductsDB();

    // Add a battle to the DB using addBattleToDB/addChargerToDB func
    public boolean addBattle(Battle battle) {
        if(getProductByID(battle.getId()) == null && battle.getPrice() > 0) {
            productsDB.addBattleToDB(battle);
            return true;
        }
        return false;
    }

    // Add a charger to the DB using addBattleToDB/addChargerToDB func
    public boolean addCharger(Charger charger) {
        if(getProductByID(charger.getId()) == null && charger.getPrice() > 0) {
            productsDB.addChargerToDB(charger);
            return true;
        }
        return false;
    }

    // Get all the products from the DB using getProducts func
    public List<Product> getAllProducts() {
        return this.productsDB.getProducts();
    }

    // Get all the battles from the DB using getProducts func
    public List<Battle> getAllBattles() {
        List<Battle> battles;
        battles = new ArrayList<Battle>();
        for (Product product : productsDB.getProducts()) {
            if (product instanceof Battle)
                battles.add((Battle)product);
        }
        return battles;
    }

    public int getBattlesAmount() {
        int counter = 0;
        for (Product product : productsDB.getProducts()) {
            if (product instanceof Battle)
                counter++;
        }
        return counter;
    }

    public int getChargersAmount() {
        int counter = 0;
        for (Product product : productsDB.getProducts()) {
            if (product instanceof Charger)
                counter++;
        }
        return counter;
    }

    // Get all the chargers from the DB using getProducts func
    public List<Charger> getAllChargers() {
        List<Charger> chargers;
        chargers = new ArrayList<Charger>();
        for (Product product : productsDB.getProducts()) {
            if (product instanceof Charger)
                chargers.add((Charger)product);
        }
        return chargers;
    }

    // Get a specific product using getProducts func
    public Product getProductByID(String id) {
        for (Product product : productsDB.getProducts()) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    // Update a product that is in the DB
    public boolean updateBattle(Battle battle) {
        List<Battle> battles = getAllBattles();
        for(Battle b : battles) {
            if (b.getId().equals(battle.getId())) {
                b.setType(battle.getType());
                b.setPrice(battle.getPrice());
                b.setExpDate(battle.getSExpDate());
                return true;
            }
        }
        return false;
    }

    // Update a product that is in the DB
    public boolean updateCharger(Charger charger) {
        List<Charger> chargers = getAllChargers();
        for(Charger c : chargers) {
            if (c.getId().equals(charger.getId())) {
                c.setType(charger.getType());
                c.setPrice(charger.getPrice());
                c.setSpecificType(charger.getSpecificType());
                c.setCompany(charger.getCompany());
                return true;
            }
        }
        return false;
    }

    // delete a product from the DB using removeProduct func
    public boolean deleteProduct(String id) {
        for (Product product : productsDB.getProducts()) {
            if (product.getId().equals(id)) {
                productsDB.removeProductFromDB(product);
                return true;
            }
        }
        return false;
    }

}
