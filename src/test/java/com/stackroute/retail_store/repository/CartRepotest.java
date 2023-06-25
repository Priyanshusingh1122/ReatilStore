package com.stackroute.retail_store.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.stackroute.retail_store.model.Cart;

public class CartRepotest {

    @Autowired
    private CartRepo cartRepo  ;

    @Test
    public void testFindByCategory() {


        // Perform the repository method call
//        Optional<Cart> carts = cartRepo.findById(1);

        // Assert the results
//        assertEquals(1, carts.get().getId());
        }
    
}
