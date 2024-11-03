package co.edu.unbosque.sw2.checkoutservice.controller;

import co.edu.unbosque.sw2.checkoutservice.model.Checkout;
import co.edu.unbosque.sw2.checkoutservice.model.Product;
import co.edu.unbosque.sw2.checkoutservice.service.CheckoutInterface;
import co.edu.unbosque.sw2.checkoutservice.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class checkOutController {

    @Autowired
    CheckoutService service;

    public checkOutController() {

    }
    @GetMapping("/viewCheckout")
    public ResponseEntity<?> viewCheckout() {
        try {
            Checkout checkout = service.showCheckOut();
            return ResponseEntity.ok(checkout);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al obtener el checkout");
        }
    }


}
