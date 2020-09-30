package com.example.demo.rest;

import lombok.Data;

@Data
public class AuthenticationDTO {
    private String email;
    private String password;
}
