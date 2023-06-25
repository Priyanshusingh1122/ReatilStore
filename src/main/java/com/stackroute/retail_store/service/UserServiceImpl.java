package com.stackroute.retail_store.service;

import java.util.Optional;

import com.stackroute.retail_store.model.JwtResponse;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stackroute.retail_store.model.Cart;
import com.stackroute.retail_store.model.RetailUser;
import com.stackroute.retail_store.repository.UserRepo;
import com.stackroute.retail_store.repository.CartRepo;
// import com.stackroute.retail_store.service.CartService;




@Service
public class UserServiceImpl implements UserService{

    // autowire UserRepo

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JwtToken jwtToken;

    // @Autowired
    //  private CartRepo cartRepo; 

    @Override
    public RetailUser registerUser(RetailUser user) {
// register new user

      RetailUser userR ;
      try{
          userR = userRepo.save(user);
      } catch (Exception e){
        throw  new RuntimeException("User already exists");      }
       System.out.println(userR.toString());
      return userR;
    }

    @Override
    public ResponseEntity<?> login(String email, String password) {
        // check if user exist with given email and password

        System.out.println("1st");
        System.out.println(userRepo.findByEmailIdAndPassword(email, password));

        System.out.println("2nd");
        System.out.println(email);
        String emailId = email;
        System.out.println(emailId);
        System.out.println(userRepo.findByEmailId(email).size());

        //   System.out.println(userRepo.findByName("John Doe").size());
        if (userRepo.findByEmailId(email).size() == 0) {
            return new ResponseEntity<>("Login Failed", HttpStatus.UNAUTHORIZED);
        } else {
            RetailUser user = userRepo.findByEmailId(email).get(0);
            if (user.getEmailId().equals(email) && user.getPassword().equals(password)) {

                // if user exist then generta jwt tooken and return it by using response entity
                System.out.println("success");
//                return new ResponseEntity<>(jwtToken.generateToken(email), HttpStatus.OK);
                final String token = jwtToken.generateToken(email);

                return  ResponseEntity.ok(new JwtResponse(token));
//                return  ResponseEntity.ok(new JwtResponse(token));
            } else {

                // if user does not exist then return response entity with status code 401
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }


        }
    }

    // implement methods for UserService

    @Override
    public Iterable<RetailUser> getAllUsers() {

        return userRepo.findAll();
       
    }
    

    
}

