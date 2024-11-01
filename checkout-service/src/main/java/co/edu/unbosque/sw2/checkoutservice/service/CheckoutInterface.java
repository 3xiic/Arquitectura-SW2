package co.edu.unbosque.sw2.checkoutservice.service;

import co.edu.unbosque.sw2.checkoutservice.model.Checkout;
import co.edu.unbosque.sw2.checkoutservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("getProducts")
public interface CheckoutInterface {
    @RequestMapping(method = RequestMethod.GET, value = "/getProducts")
    List<Product> getProducts();


}


