package com.stackroute.retail_store.service;

import java.util.Optional;

import org.hibernate.mapping.List;
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
        System.out.println(userR.toString());
    }

    @Override
    public String login(String email, String password) {
   // check if user exist with given email and password

   System.out.println("1st");
   System.out.println(userRepo.findByEmailIdAndPassword(email, password));

   System.out.println("2nd");
   System.out.println(email);
   String emailId = email;
   System.out.println(emailId);
   System.out.println(userRepo.findByEmailId(email).size());
   
      System.out.println(userRepo.findByName("John Doe").size());
      RetailUser user = userRepo.findByEmailId(email).get(0);
      System.out.println(user.toString());

   if(user.getEmailId().equals(email) && user.getPassword().equals(password))
   {
    return " Login Successful";
   }
// //    System.out.println(userRepo.findByName("John Doe").toString());
return "Login Failed";

    // System.out.println(user.toString());
//   List<RetailUser> user =  userRepo.findByEmail(email, password);

// //    find user W

//    System.out.println(user.toString()   );


//     if(user == null) {
//         return "Login Failed";
//     } else {
//         return "Login Successful";
//     }



    }

    // implement methods for UserService

    @Override
    public Iterable<RetailUser> getAllUsers() {

        return userRepo.findAll();
       
    }
    

    
}

