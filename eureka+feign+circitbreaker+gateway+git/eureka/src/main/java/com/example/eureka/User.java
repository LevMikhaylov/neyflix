package com.example.eureka;

public class User {
    @SuppressWarnings("unused")
    private int id;
    @SuppressWarnings("unused")
    private String username;
    @SuppressWarnings("unused")
    private String password;
    public User(String username, String password){
        this.id++;
        this.username = username;
        this.password = password;
    }
}
