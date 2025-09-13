package com.example.apprata;

public class AuthManager {
    private final String USER = "admin";
    private final String PASS = "1234";

    public boolean login(String usuario, String password) {
        return usuario.equals(USER) && password.equals(PASS);
    }
}
