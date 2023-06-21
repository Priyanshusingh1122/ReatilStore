package com.stackroute.retail_store.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class CartItem {
    
    // create a class CartItem with fields product and quantity

    private Product product;
    private int quantity;

}
