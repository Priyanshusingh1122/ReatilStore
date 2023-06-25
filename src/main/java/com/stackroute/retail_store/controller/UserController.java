package com.stackroute.retail_store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.stackroute.retail_store.model.Login;
import com.stackroute.retail_store.model.RetailUser;
import com.stackroute.retail_store.service.UserService;

// Create a User Controller class with end points for registering new user and login with email and password
@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    // autowire UserService

    @Autowired
    UserService userService ;

    // create end point for registering new user with url /api/v1/user/register

    @PostMapping("/register")
    public RetailUser registerUser(@RequestBody RetailUser user) {
        // user.setRole(Role.user);
        System.out.println(user.toString());
        return userService.registerUser(user);
    }

    // create end point for login with email and password with url /api/v1/user/login

    // @PostMapping("/login")
    // public String login(String emailId, String password) {
    //     System.out.println(emailId + " " + password);
    //     return userService.login(emailId, password);
    // }

     @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Login login) {
        // System.out.println(loemailId + " " + password);

        System.out.println(login.getEmail() + " " + login.getPassword());
        return userService.login(login.getEmail(), login.getPassword());
    }


    //  method for getting all users

    @GetMapping("/all")
    public Iterable<RetailUser> getAllUsers() {
        return userService.getAllUsers();
    }


    // create end point for getting all users with url /api/v1/user/all

     





}