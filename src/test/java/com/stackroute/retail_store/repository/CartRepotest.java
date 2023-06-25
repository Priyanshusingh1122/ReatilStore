package com.stackroute.retail_store.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;

import com.stackroute.retail_store.model.Cart;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.stereotype.Service;


@DataMongoTest
class CartRepotest {


    @Autowired
    private CartRepo cartRepo;

//    write test cases for CartRepo's save method
    @Test
    public void testSaveCart() {
        Cart cart = new Cart();
        cart.setId("1");
        cartRepo.save(cart);
        Optional<Cart> cart1 = cartRepo.findById("1");
        assertEquals(cart1.get().getId(), cart.getId());
    }

//    write test cases for CartRepo's findById method
    @Test
    public void testFindById() {
        Cart cart = new Cart();
        cart.setId("1");
        cartRepo.save(cart);
        Optional<Cart> cart1 = cartRepo.findById("1");
        assertEquals(cart1.get().getId(), cart.getId());
    }


//    write test cases for CartRepo's deleteById method
    @Test
    public void testDeleteById() {
        Cart cart = new Cart();
        cart.setId("1");
        cartRepo.save(cart);
        cartRepo.deleteById("1");
        Optional<Cart> cart1 = cartRepo.findById("1");
        assertEquals(cart1.isEmpty(), true);
    }
}
