//// create controller for product
//
//// Path: src/main/java/com/stackroute/retail_store/controller/Controller.java
//
//
//package com.stackroute.retail_store;
//
//
//import java.util.List;
//import java.util.Optional;
//
//import com.stackroute.retail_store.Repo;
//import com.stackroute.retail_store.model.Product;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping("/api/v1")
//public class Controller {
//
//    @Autowired
//    private Repo repo;
//
//
//
//// create a methot to say hello
//
//
//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello from Spring Boot";
//    }
//
//
//    // create a method to get all products
//    @GetMapping("/products")
//    public List<Product> getAllProducts() {
//        return repo.findAll();
//    }
//
//    // create a method to get product by id
//    @GetMapping("/products/{id}")
//    public Optional<Product> getProductById(@PathVariable String id) {
//        return repo.findById(id);
//    }
//
//    // create a method to add product
//    @PostMapping("/products")
//    public Product addProduct(@RequestBody Product product) {
//        return repo.save(product);
//    }
//
//    // create a method to update product
//    @PutMapping("/products/{id}")
//    public Product updateProduct(@RequestBody Product product, @PathVariable String id) {
//        product.setId(id);
//        return repo.save(product);
//    }
//
//    // create a method to delete product
//    @DeleteMapping("/products/{id}")
//    public void deleteProduct(@PathVariable String id) {
//        repo.deleteById(id);
//    }
//
//}
