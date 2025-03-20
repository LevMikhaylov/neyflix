package com.example.eureka;
import java.util.regex.Pattern;
public class User {
    @SuppressWarnings("unused")
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = ++id;
        this.name = name;
        this.email = email;
    }
    public void setEmail(String email){
        if(!Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", email)){
            throw new IllegalArgumentException("Email is not valid!");
        }
        else{
            this.email=email;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getName(){
        return this.name;
    }
}
