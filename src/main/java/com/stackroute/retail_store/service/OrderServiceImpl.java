package com.stackroute.retail_store.service;

import com.stackroute.retail_store.model.CartItem;
import com.stackroute.retail_store.model.Order;
import com.stackroute.retail_store.model.OrderRequest;
import com.stackroute.retail_store.model.RetailUser;
import com.stackroute.retail_store.repository.OrderRepo;
import com.stackroute.retail_store.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Priyanshu Singh
 */

@Service
public class OrderServiceImpl implements OrderService{

 @Autowired
 UserRepo userRepo;

 @Autowired
 OrderRepo orderRepo;

 @Override
 public Order saveOrder(OrderRequest orderRequest) {
     System.out.println("//////////////////////////////");
     System.out.println(orderRequest.getUserId());
  Order newOrder = new Order();
  // check if orderRequest is null
    if(orderRequest == null){
     throw new NullPointerException("OrderRequest is null");
    }
//    check if userExist  in database or not by using UserRepo and if not then throw UserNotFoundException
     Optional<RetailUser> user = userRepo.findByUid(orderRequest.getUserId()   );
     System.out.println(user.toString());
     System.out.println("/////////////////////////////");
        if(user.isEmpty()){
        throw new NullPointerException("User not found");
        }
//    set userId in newOrder
      newOrder.setUserId(orderRequest.getUserId());
//    set products in newOrder
      newOrder.setProducts(orderRequest.getProducts());
//    set totalPrice in newOrder by calculating total price of list of CartItem in orderRequest
      List<CartItem> cartItems = orderRequest.getProducts();
        double totalPrice = 0;
        for(CartItem cartItem : cartItems){
         totalPrice += cartItem.getProduct().getPrice() * cartItem.getQuantity();
        }
        newOrder.setTotalPrice(totalPrice);

//    set deliveryAddress in newOrder
        newOrder.setDeliveryAddress(orderRequest.getDeliveryAddress());
//    set dateOfOrder in newOrder
        newOrder.setDateOfOrder(java.time.LocalDate.now().toString());
//    set timeOfOrder in newOrder
        newOrder.setTimeOfOrder(java.time.LocalTime.now().toString());
//    save newOrder in database by using OrderRepo
        return orderRepo.save(newOrder);


 }
}
