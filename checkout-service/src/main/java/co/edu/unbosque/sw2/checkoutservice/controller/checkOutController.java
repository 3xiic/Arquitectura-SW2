package co.edu.unbosque.sw2.checkoutservice.controller;

import co.edu.unbosque.sw2.checkoutservice.model.Checkout;
import co.edu.unbosque.sw2.checkoutservice.model.Product;
import co.edu.unbosque.sw2.checkoutservice.service.CheckOutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class checkOutController implements CheckOutService {

    ArrayList<String> paymentMethods = new ArrayList<String>(Arrays.asList("Nequi", "Cash", "Card"));

    @Override
    public List<Product> getProducts() {
        return List.of();
    }
    @GetMapping("/viewCheckouts")
    @Override
    public Checkout showCheckOut(Checkout checkout) {
        int value = 0;
        for (int i = 0; i < getProducts().size(); i++){
            value += getProducts().get(i).getValue();
        }
        return new Checkout(
                UUID.randomUUID().toString(),
                "https://tiendaonline.com",
                value,
                paymentMethods
        );
    }
}
