package com.stackroute.retail_store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.retail_store.model.Role;
import com.stackroute.retail_store.model.RetailUser;
import com.stackroute.retail_store.service.UserService;

// Create a User Controller class with end points for registering new user and login with email and password
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    // autowire UserService

    @Autowired
    UserService userService ;

    // create end point for registering new user with url /api/v1/user/register

    @PostMapping("/register")
    public void registerUser(@RequestBody RetailUser user) {
        // user.setRole(Role.user);
        System.out.println(user.toString());
        userService.registerUser(user);
    }

    // create end point for login with email and password with url /api/v1/user/login

    @PostMapping("/login")
    public String login(String email, String password) {
        System.out.println(email + " " + password);
        return userService.login(email, password);
    }


    //  end points for get, update , delete users



}