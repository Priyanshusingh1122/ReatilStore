package com.stackroute.retail_store.service;
import org.springframework.stereotype.Service;
import com.stackroute.retail_store.model.Cart;
import com.stackroute.retail_store.model.Product;

@Service
public interface CartService {

    // create a method to get cart by id
    public Cart getCartById(int cartId);

    // create a method to add product to cart
    public Cart addProductToCart(int cartId,Product product);

    // declare a method to remove product from cart
    public Cart removeProductFromCart(int cartId,Product product);

    // declare a method to update product quantity in cart
    public Cart updateProductQuantity(int cartId,Product product,int quantity);


    // declare a method for clear cart
    public Cart clearCart(int cartId);


    // declare a method to get total price of cart
    public double getTotalPrice(int cartId);

    

}
