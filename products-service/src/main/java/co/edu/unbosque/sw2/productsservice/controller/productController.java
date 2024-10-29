package co.edu.unbosque.sw2.productsservice.controller;

import co.edu.unbosque.sw2.productsservice.model.Product;
import org.apache.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class productController {

    @PostMapping("/getProducts")
    public Product getProduct(Product product) {
        return product;
    }

    @PostMapping("/createProduct")
    public ResponseEntity<String> createProduct(@RequestParam int id, @RequestParam int value, @RequestParam String name, @RequestParam String description){
        new Product(id, value, name, description);
        return ResponseEntity.ok("Creado");
    }

    public productController() {

    }
}
