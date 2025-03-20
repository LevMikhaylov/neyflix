package com.example.eureka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public class OrderController {
    @Autowired
    private Order_service os;
    
    @GetMapping("/orders/{userId}")
    public String getOrdersByUserId(@PathVariable int userId) {
        // Здесь можно добавить логику для получения списка заказов
        // Для примера просто вызываем User-Service
        List<Order> userInfo = os.getUsersOrdersById(userId);
        return "Orders for user: " + userInfo;
    }
}
