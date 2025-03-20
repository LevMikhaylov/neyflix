package com.example.eureka;

import java.time.LocalDate;

public class Order {
    @SuppressWarnings("unused")
    private int id;
    @SuppressWarnings("unused")
    private LocalDate creationDate;
    public Order(){
        this.id++;
        this.creationDate = LocalDate.now();
    }
}
