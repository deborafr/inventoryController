package com.example.vendingmachine.controller;

import com.example.vendingmachine.model.Battle;
import com.example.vendingmachine.model.Charger;
import com.example.vendingmachine.model.Product;
import com.example.vendingmachine.service.ProductsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Define this class will be a handler for HTTP calls
@RestController
public class ProductController {

    private ProductsService productService;

    public ProductController() {
        this.productService = new ProductsService();
    }

    //An HTTP request to return all the products that are in the DB
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //An HTTP request to add a battle to the DB
    @PostMapping("/battle")
    public ResponseEntity<Battle> createBattle(@RequestBody Battle battle) {
        boolean successful = productService.addBattle(battle);
        if (successful)
            return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(battle);
        return ResponseEntity.status(HttpStatus.CONFLICT).body(battle);
    }

    //An HTTP request to add a charger to the DB
    @PostMapping("/charger")
    public ResponseEntity<Charger> createCharger(@RequestBody Charger charger) {
        boolean successful = productService.addCharger(charger);
        if(successful) {
            return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(charger);
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body(charger);
    }

    //An HTTP request to return all the battles that are in the DB
    @GetMapping("/battles")
    public List<Battle> getAllBattles() {
        return productService.getAllBattles();
    }

    //An HTTP request to return amount of battles that are in the DB
    @GetMapping("/battlesAmount")
    public int getBattlesAmount() {
        return productService.getBattlesAmount();
    }

    //An HTTP request to return all the chargers that are in the DB
    @GetMapping("/chargers")
    public List<Charger> getAllChargers() {
        return productService.getAllChargers();
    }

    //An HTTP request to return amount of chargers that are in the DB
    @GetMapping("/chargersAmount")
    public int getChargersAmount() {
        return productService.getChargersAmount();
    }

    //An HTTP request to to get a specific product by ID
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable String id){
        return productService.getProductByID(id);
    }

    //An HTTP request to update a battle by ID
    @PatchMapping("/battles")
    public ResponseEntity<Battle> patchProduct(@RequestBody Battle battle) {
        boolean status = productService.updateBattle(battle);
        if (status)
            return ResponseEntity.status(HttpStatus.OK).body(battle);
        else
            return ResponseEntity.status(HttpStatus.CONFLICT).body(battle);
    }

    //An HTTP request to update a charger by ID
    @PatchMapping("/charger")
    public ResponseEntity<Charger> patchProduct(@RequestBody Charger charger) {
        boolean status = productService.updateCharger(charger);
        if (status)
            return ResponseEntity.status(HttpStatus.OK).body(charger);
        else
            return ResponseEntity.status(HttpStatus.CONFLICT).body(charger);
    }


    //An HTTP request to delete a product by ID
    @DeleteMapping("/product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable final String id) {
        boolean successfull = productService.deleteProduct(id);
        if (successfull)
            return ResponseEntity.status(HttpStatus.OK).body(id);
        return ResponseEntity.status(HttpStatus.CONFLICT).body(id);
     }
}
