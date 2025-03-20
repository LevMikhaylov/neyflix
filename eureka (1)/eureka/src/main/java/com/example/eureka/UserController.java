package com.example.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        return new User(id, "John Doe", "john.doe@example.com");
    }
}
