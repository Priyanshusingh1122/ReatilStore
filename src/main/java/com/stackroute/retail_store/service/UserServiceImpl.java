package com.stackroute.retail_store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.retail_store.model.RetailUser;
import com.stackroute.retail_store.repository.UserRepo;


@Service
public class UserServiceImpl implements UserService{

    // autowire UserRepo

    @Autowired
    private UserRepo userRepo;

    @Override
    public void registerUser(RetailUser user) {
// register new user
      RetailUser userR =  userRepo.save(user);
    }

    @Override
    public String login(String email, String password) {
   // check if user exist with given email and password
   RetailUser user = userRepo.findByEmailAndPassword(email, password);
    if(user != null) {
        return "Login Successful";
    }
        return "Login Failed";
    }
    // implement methods for UserService

    @Override
    public Iterable<RetailUser> getAllUsers() {

        return userRepo.findAll();
       
    }
    


    // implement method for registering new user




    // implement method for login with email and password

    
}
