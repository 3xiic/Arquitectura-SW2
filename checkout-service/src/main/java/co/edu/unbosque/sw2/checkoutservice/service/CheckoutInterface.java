package co.edu.unbosque.sw2.checkoutservice.service;

import co.edu.unbosque.sw2.checkoutservice.configuration.LoadBalancingConfiguration;
import co.edu.unbosque.sw2.checkoutservice.model.Checkout;
import co.edu.unbosque.sw2.checkoutservice.model.Product;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "products-service")
@LoadBalancerClient(value = "products-service", configuration = LoadBalancingConfiguration.class)
public interface CheckoutInterface {
    @GetMapping("/getProducts")
    List<Product> getProducts();
}



