package com.stackroute.retail_store.service;

import com.stackroute.retail_store.customExceptiom.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stackroute.retail_store.model.RetailUser;

@Service
public interface UserService {
    

    // declare method for registering new user
    public RetailUser registerUser(RetailUser user) throws UserNotFoundException;


    // declare method for login with email and password
    public ResponseEntity login(String email, String password);


    public Iterable<RetailUser> getAllUsers();
}
