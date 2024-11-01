package co.edu.unbosque.sw2.productsservice.controller;

import co.edu.unbosque.sw2.productsservice.model.Product;
import org.apache.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
public class productController {

    @PostMapping("/getProducts")
    public Product getProduct(Product product) {
        return product;
    }

    @GetMapping("/getProduct")
    public Product getProd(Product product) {
        return product;
    }

    @PostMapping("/createProduct")
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        new Product(product);
        System.out.println("Product created");
        return ResponseEntity.ok("Creado");

    }

    public productController() {

    }
}
