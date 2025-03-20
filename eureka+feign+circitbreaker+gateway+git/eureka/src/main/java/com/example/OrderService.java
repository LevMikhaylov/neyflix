package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.eureka.UserServiceClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

public class OrderService {
    
    @Autowired
    private UserServiceClient userServiceClient;

    @CircuitBreaker(name = "userService", fallbackMethod = "fallbackGetUser ById")
    public String getUserById(@PathVariable int id) {
        return userServiceClient.getUserById(id);
    }

    public String fallbackGetUserById(String id, Throwable throwable) {
        return "{\"message\": \"User  service is down. Returning fallback response.\"}";
    }
}
