package co.edu.unbosque.sw2.productsservice.controller;

import co.edu.unbosque.sw2.productsservice.model.Product;
import org.apache.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class productController {
    ArrayList<Product> products = new ArrayList<>();
    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return products;
    }

    @PostMapping("/createProduct")
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        products.add(new Product(product));
        System.out.println("Product created");
        return ResponseEntity.ok("Creado");

    }

    public productController() {

    }
}
