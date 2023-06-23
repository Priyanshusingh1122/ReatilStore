package com.stackroute.retail_store.model;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;


// Mark class as Data, Getter and Setter
@Data
@Getter
@Setter
// Mark as entity

@Document(collection = "Products")  
public class Product {
    
    // create a data model for retail store products with spring boot id field
    // and other fields as name, price, description, image url, category, brand, rating, discount
    // use lombok to generate getters and setters

    @Id
    private int id;
    private String name;
    private double price;
    private String description;
    private String imageUrl;
    private String category;
    private String brand;
    private String rating;
    private String discount;
    private Boolean inStock;


}
