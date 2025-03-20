package com.example.eureka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service") //Feign использует балансировку автоматически
public interface UserServiceClient {
    @GetMapping("/users/{id}")
    String getUserById(@PathVariable("id") int id);
}
