// create controller for product

// Path: src/main/java/com/stackroute/retail_store/controller/Controller.java


package com.stackroute.retail_store;


import java.util.List;
import java.util.Optional;

import com.stackroute.retail_store.model.Product;

import com.stackroute.retail_store.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private Repo repo;


// create a methot to say hello


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot";
    }


    // create a method to get all products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

//    // create a method to get product by id
    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return repo.findById(id);
    }
//
//    // create a method to add product

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return repo.save(product);
    }


    // create a method to update product
    @PutMapping("/products/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable int id) {
        product.setId(id);
        return repo.save(product);
    }

  // create a method to delete product
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        repo.deleteById(id);
    }


//    Create a method to get products by category
    @GetMapping("/products/category/{category}")
    public List<Product> getProductByCategory(@PathVariable String category) {
        return repo.findByCategory(category);


    }


    // method for finding products in given price range
    @GetMapping("/products/price/{min}/{max}")
    public List<Product> getProductByPrice(@PathVariable int min, @PathVariable int max) {
        // iterate through all the products and find products in given price range

    // List<Product> products = repo.findAll();
    // for (Product product : products) {
    //     if (product.getPrice() >= min && product.getPrice() <= max) {
    //         System.out.println(product);
    //     }



        System.out.println("min: " + min + " max: " + max);
        return repo.findByPriceBetween(min, max);
    }
}


