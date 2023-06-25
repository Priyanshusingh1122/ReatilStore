package com.stackroute.retail_store.service;

import com.stackroute.retail_store.model.Cart;
import com.stackroute.retail_store.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Priyanshu Singh
 */

@SpringBootTest
public class CartServiceImplTest {

//    autowire cart service
    @Autowired
    private CartService cartService;


//    write test case for add product to cart method
    @Test
        public void testAddProductToCart() {
            Cart cart = new Cart();
            cart.setId("1");
            Product product = new Product();
            product.setId(1);
            cartService.addProductToCart(cart.getId(), product);
            Cart cart1 = cartService.getCartById(cart.getId());
            assertEquals(cart1.getCartItems().get(0).getProduct().getId(), product.getId());
        }

//        write test case for clear Products from Cart
        @Test
        public void testClearCart() {
            Cart cart = new Cart();
            cart.setId("1");
            Product product = new Product();
            product.setId(1);
            cartService.addProductToCart(cart.getId(), product);
            cartService.clearCart(cart.getId());
            Cart cart1 = cartService.getCartById(cart.getId());
            assertEquals(cart1.getCartItems().isEmpty(), true);
        }
}
