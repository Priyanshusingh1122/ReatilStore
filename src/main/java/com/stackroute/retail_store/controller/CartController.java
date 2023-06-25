package com.stackroute.retail_store.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.retail_store.model.Cart;
import com.stackroute.retail_store.model.Product;
import com.stackroute.retail_store.service.CartService;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {


    //  autowired CartService

    @Autowired
    CartService cartService;

    // create end point for adding product to cart with url /api/v1/cart/add

    @PostMapping("/add/{cartId}")
    public Cart addProductToCart(@PathVariable String cartId, @RequestBody Product product) {
      return  cartService.addProductToCart(cartId, product);
    }


    // create end point for clearing cart with url /api/v1/cart/clear

    @PostMapping("/clear/{cartId}")
    public Cart clearCart(@PathVariable String cartId) {
        return cartService.clearCart(cartId);
    }



    // create end point for removing product from cart with url /api/v1/cart/remove

    @PostMapping("/remove/{cartId}")
    public Cart removeProductFromCart(@PathVariable String cartId, @RequestBody Product product) {
        return cartService.removeProductFromCart(cartId, product);
    }

    // Create end point for updating product quantity in cart with url /api/v1/cart/update

    @PostMapping("/updatequantity/{cartId}")
    public Cart updateProductQuantity(@PathVariable String cartId, @RequestBody Product product,int quantity) {
        return cartService.updateProductQuantity(cartId, product, quantity);
    }

    // create end point for getting total price of cart with url /api/v1/cart/totalprice

    @GetMapping("/totalprice/{cartId}")
    public double getTotalPrice(@PathVariable String cartId) {
        return cartService.getTotalPrice(cartId);
    }

    // create end point for getting cart by id with url /api/v1/cart/{cartId} and use ResponseEntity for returning response
    @GetMapping("/{cartId}")
    ResponseEntity<Cart> getCartById(@PathVariable String cartId) {
        // return ResponseEntity.ok(cartService.getCartById(cartId));
        //  id cart is not found then return response with status code 404 with messge cart does not exist

        Cart cart = cartService.getCartById(cartId);
        if (cart == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cart);
    }
    
    
}

