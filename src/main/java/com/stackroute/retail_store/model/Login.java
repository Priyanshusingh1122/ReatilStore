package com.stackroute.retail_store.model;

public class Login {
    private String email;
    private String password;

    public Login() {
    }

    public Login(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

    // getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getters and setters
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
