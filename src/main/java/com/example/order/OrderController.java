package com.example.order;

import com.example.order.entity.Order;
import com.example.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/order")
    public String getOrder()
    {
        return "Order info is returned";
    }

    @PostMapping("/order")
    public String createOrder(@RequestBody Order order) {
        String uri = "http://localhost:8080/inventory/" + order.productname;
        RestTemplate restTemplate = new RestTemplate();
        Integer stockInHand = restTemplate.getForObject(uri, Integer.class);
        if (stockInHand > 0) {
            orderRepository.save(order);
            return "Order placed...";
        }
        else {
            return "Order not placed";
        }
    }
}


