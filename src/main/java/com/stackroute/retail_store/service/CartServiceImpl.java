// // implement service class implementation for CartService
// //
// // Path: src/main/java/com/stackroute/retail_store/service/CartServiceImpl.java
// package com.stackroute.retail_store.service;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.stackroute.retail_store.model.Cart;
// import com.stackroute.retail_store.model.Product;
// import com.stackroute.retail_store.repository.CartRepo;

// @Service
// public class CartServiceImpl implements CartService {

//     // autowire CartRepo
//     @Autowired
//     private CartRepo cartRepo;

//     @Override
//     public Cart addProductToCart(Product product,int cartId) {
//         //  check if cart exist with given cartId
//         Optional<Cart> cartList = cartRepo.findById(cartId);

//         // check if cartList is present and add product to cart

//         if (cartList.isPresent()) {
//             Cart cart = cartList.get();
//             List<Product> products = cart.getProduct();
//             products.add(product);
//             cart.setProduct(products);
//             return cartRepo.save(cart);
//         }
//         else {
//             // create new cart and add product to it
//             Cart cart = new Cart();
//             List<Product> products = new ArrayList<Product>();
//             products.add(product);
//             cart.setProduct(products);
//             return cartRepo.save(cart);
//         }
//     //    return cartRepo.save();
//     }

//     @Override
//     public List<Product> getAllProductsInCart(int cartId) {
//         // get all products in cart
//         Optional<Cart> cartList = cartRepo.findById(cartId);

//         // check if cartList is present

//         if (cartList.isPresent()) {
//             Cart cart = cartList.get();
//             return cart.getProduct();
//         }
//         else {
//             return new ArrayList<Product>();
//         }
        
    
    
//     }

   

//     @Override
//     public void emptyCart(int cartId) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'emptyCart'");
//     }

//     @Override
//     public double getTotalPrice(int cartId) {
//         // calculate the total price of products in cart and return it
//         Optional<Cart> cartList = cartRepo.findById(cartId);

//         // check if cartList is present

//         if (cartList.isPresent()) {
//             Cart cart = cartList.get();
//             List<Product> products = cart.getProduct();
//             double totalPrice = 0;
//             for (Product product : products) {
//                 totalPrice += product.getPrice();
//             }
//             return totalPrice;
//         }
//         else {
//             return 0;
//         }
        
//     }

//     @Override
//     public void removeProductFromCart(int productId, int cartId) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'removeProductFromCart'");
//     }

// }

