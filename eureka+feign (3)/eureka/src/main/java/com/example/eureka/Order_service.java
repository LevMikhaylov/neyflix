package com.example.eureka;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "order-service")
public interface Order_service {
    @PostMapping("/users/{id}")
    void postOrders(@PathVariable("id") int id);
    @GetMapping("/users/{id}")
    List<Order> getUsersOrdersById(@PathVariable("id") int id);
}
