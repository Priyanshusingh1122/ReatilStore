package com.stackroute.retail_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.retail_store.model.RetailUser;

@Repository
public interface UserRepo extends JpaRepository<RetailUser, Integer>{

    RetailUser findByEmailAndPassword(String email, String password);
    
}
