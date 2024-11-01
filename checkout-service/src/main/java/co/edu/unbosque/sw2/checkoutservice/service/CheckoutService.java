package co.edu.unbosque.sw2.checkoutservice.service;

import co.edu.unbosque.sw2.checkoutservice.model.Checkout;
import co.edu.unbosque.sw2.checkoutservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class CheckoutService implements  CheckoutInterface {

    private final CheckoutInterface checkoutInterface;

    ArrayList<String> paymentMethods = new ArrayList<>(Arrays.asList("Nequi", "Cash", "Card"));

    @Autowired
    public CheckoutService(CheckoutInterface checkoutInterface) {
        this.checkoutInterface = checkoutInterface;
    }

    @Override
    public List<Product> getProducts() {
        return checkoutInterface.getProducts();
    }

    public Checkout showCheckOut() {
        int value = 0;
        List<Product> products = getProducts();
        System.out.println(products.size());
        for (Product product : products) {
            value += product.getValue();
            System.out.println("Entro");
            System.out.println(product.getValue());
        }

        return new Checkout(
                UUID.randomUUID().toString(),
                "https://tiendaonline.com",
                value,
                paymentMethods
        );
    }
}
