package com.stackroute.retail_store.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.retail_store.model.Cart;
import com.stackroute.retail_store.model.CartItem;
import com.stackroute.retail_store.model.Product;
import com.stackroute.retail_store.repository.CartRepo;


@Service
public class CartServiceImpl implements CartService {

    // autowired cart repository
    @Autowired
    private CartRepo cartRepo; 

    @Override
    public Cart addProductToCart(int cartId, Product product) {

        // check if product already exist in cart cartItems list then increase quantity
        // else add product to cartItems list 

        Optional<Cart> cart = cartRepo.findById(cartId); 
         // check if cart exist or not if not then create new cart and add product to it

         if(cart.isEmpty())
            {
               Cart cartt = new Cart();
               cartt.setId(cartId);

                // create a new cartItem and add product to it
                CartItem cartItem = new CartItem();
                cartItem.setProduct(product);
                cartItem.setQuantity(1);
                List<CartItem> cartItems = new ArrayList<CartItem>();
                cartItems.add(cartItem);

                // add cartItem to cartItems list
                // cartt.getCartItems().add(cartItem);
                cartt.setCartItems(cartItems);
                cartRepo.save(cartt);
                return cartt;

            }
            else
            {
                // check if product already exist in cart cartItems list then increase quantity
                // else add product to cartItems list 

                List<CartItem> cartItems = cart.get().getCartItems();
                boolean flag = false;
                for(CartItem cartItem : cartItems)
                {
                    if(cartItem.getProduct().getId() == product.getId())
                    {
                        cartItem.setQuantity(cartItem.getQuantity()+1);
                        flag = true;
                        break;
                    }
                }
                if(!flag)
                {
                    // create a new cartItem and add product to it
                    CartItem cartItem = new CartItem();
                    cartItem.setProduct(product);
                    cartItem.setQuantity(1);

                    // add cartItem to cartItems list
                    cart.get().getCartItems().add(cartItem);
                }
                cartRepo.save(cart.get());
                return cart.get();
            }     
    }

    @Override
    public Cart clearCart(int cartId) {
    // check if cartExist then clear the cartItems list else return cart is already empty
    Optional<Cart> cart = cartRepo.findById(cartId);
    if(cart.isEmpty())
    {
        return null;    
    }
    else
    {
        cart.get().getCartItems().clear();
        cartRepo.save(cart.get());
        return cart.get();
    
    }

    // return null;
    }

    @Override
    public double getTotalPrice(int cartId) {
        //  fetch the cart detatails from cartRepo and calculate total price of cartItems list
        Optional<Cart> cart = cartRepo.findById(cartId);
        if(cart.isEmpty())
        {
            return 0.0;
        }
        else
        {
            double totalPrice = 0.0;
            for(CartItem cartItem : cart.get().getCartItems())
            {
                totalPrice += cartItem.getProduct().getPrice() * cartItem.getQuantity();
            }
            return totalPrice;
        }
    }

    @Override
    public Cart removeProductFromCart(int cartId, Product product) {

        // check if product exist in cartItems list then remove product from cartItems list
        // else return cart is empty

        Optional<Cart> cart = cartRepo.findById(cartId);
        if(cart.isEmpty())
        {
            return null;
        }
        else
        {
            List<CartItem> cartItems = cart.get().getCartItems();
            boolean flag = false;
            for(CartItem cartItem : cartItems)
            {
                if(cartItem.getProduct().getId() == product.getId())
                {
                    cartItems.remove(cartItem);
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                return null;
            }
            cartRepo.save(cart.get());
            return cart.get();
        }
        
    
    }

    @Override
    public Cart updateProductQuantity(int cartId, Product product, int quantity) {
        // check if product exist in cartItems list then update product quantity
        // else return cart is empty

        Optional<Cart> cart = cartRepo.findById(cartId);
        if(cart.isEmpty())
        {
            return null;
        }
        else
        {
            List<CartItem> cartItems = cart.get().getCartItems();
            boolean flag = false;
            for(CartItem cartItem : cartItems)
            {
                if(cartItem.getProduct().getId() == product.getId())
                {
                    cartItem.setQuantity(quantity);
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                return null;
            }
            cartRepo.save(cart.get());
            return cart.get();
        }
    }

    @Override
    public Cart getCartById(int cartId) {

        // check if cart exits then return cart else return null
        Optional<Cart> cart = cartRepo.findById(cartId);
        if(cart.isEmpty())
        {
            return null;
        }
        else
        {
            return cart.get();
        }
        
        
    
    
    }   
    
}



