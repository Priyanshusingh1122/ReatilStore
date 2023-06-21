package com.stackroute.retail_store.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.stackroute.retail_store.model.Cart;

// @Repository

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepo extends MongoRepository<Cart, Integer> {

    // declare method for findByCategory
    // public List<Product> findByCategory(String category);
}
    
// }
