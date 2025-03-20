package com.example.eureka;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserController {
    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable int id) {
        log.info("Request received for user id: {}", id);
        return "User  info for user with id: " + id;
    }
}
