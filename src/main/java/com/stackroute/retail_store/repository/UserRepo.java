package com.stackroute.retail_store.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.retail_store.model.RetailUser;

@Repository
public interface UserRepo extends MongoRepository<RetailUser, String>{

    RetailUser findByEmailIdAndPassword(String email, String password);

    // List<RetailUser> findByEmail(String email);
    //  Optional<RetailUser> findByEmail(String email);
     List<RetailUser> findByEmailId(String emailId);
     List<RetailUser> findByName(String name);

    
}
