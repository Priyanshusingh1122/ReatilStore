package com.stackroute.retail_store.repository;

import com.stackroute.retail_store.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Priyanshu Singh
 */
@Repository
public interface OrderRepo extends MongoRepository<Order,String> {
}

