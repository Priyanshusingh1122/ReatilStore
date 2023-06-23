package com.stackroute.retail_store.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Data
@Setter
@Getter


@Document(collection = "UserCart")  
public class Cart {
    // create a cart model class with fields as id,list of products, total price

    @Id
    private int id;
    private List<CartItem> cartItems;


}