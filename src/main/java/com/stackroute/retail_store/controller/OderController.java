package com.stackroute.retail_store.controller;

import com.stackroute.retail_store.model.OrderRequest;
import com.stackroute.retail_store.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Priyanshu Singh
 */
@RestController
@RequestMapping("/api/v1/order")
public class OderController {

//    autowire the OrderServiceImpl
    @Autowired
    private OrderServiceImpl orderService;


//    create a method for save Order with url /api/v1/order/save
   @PostMapping("/save/{userId}")
public ResponseEntity<?> saveOrder(@RequestBody OrderRequest order){

            // return by using ResponseEntity
       return ResponseEntity.ok().body(orderService.saveOrder(order));
   }
}
