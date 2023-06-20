package com.stackroute.retail_store.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



// Mark class as Data, Getter and Setter
@Data
@Getter
@Setter
// Mark as entity

@Entity
public class Product {
    
    // create a data model for retail store products with spring boot id field
    // and other fields as name, price, description, image url, category, brand, rating, discount
    // use lombok to generate getters and setters

    @Id
    private String id;
    private String name;
    private String price;
    private String description;
    private String imageUrl;
    private String category;
    private String brand;
    private String rating;
    private String discount;


}
