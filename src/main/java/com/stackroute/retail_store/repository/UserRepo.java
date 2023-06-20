package com.stackroute.retail_store.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.retail_store.model.RetailUser;

@Repository
public interface UserRepo extends JpaRepository<RetailUser, Integer>{

    RetailUser findByEmailIdAndPassword(String email, String password);

    // List<RetailUser> findByEmail(String email);
    //  Optional<RetailUser> findByEmail(String email);
     List<RetailUser> findByEmailId(String emailId);
     List<RetailUser> findByName(String name);

    
}
