package com.example.auth;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    @Override
    public String execute() {
        if ("user".equals(username) && "pass".equals(password)) {
            return SUCCESS; // A constant representing the "success" result
        } else {
            addActionError("Invalid username or password!");
            return ERROR; // A constant representing the "error" result
        }
    }

    // Getters and setters for username and password
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}