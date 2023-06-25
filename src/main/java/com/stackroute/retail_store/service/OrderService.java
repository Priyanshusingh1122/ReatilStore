package com.stackroute.retail_store.service;

import com.stackroute.retail_store.model.Order;
import com.stackroute.retail_store.model.OrderRequest;
import org.springframework.stereotype.Service;

/**
 * @author Priyanshu Singh
 */

@Service
public interface OrderService {

// declare a method for save Order
public Order saveOrder(OrderRequest order);


}
