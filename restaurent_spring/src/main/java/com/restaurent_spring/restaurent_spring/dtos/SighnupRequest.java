package com.restaurent_spring.restaurent_spring.dtos;

import lombok.Data;

@Data
public class SighnupRequest {
    private String Name;
    private String email;
    private String password;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
