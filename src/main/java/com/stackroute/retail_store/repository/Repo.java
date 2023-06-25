package com.stackroute.retail_store.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.stackroute.retail_store.model.Product;
import java.util.List;

// Mark as Repository interface
// StockRepo to extend JpaRepository

@Repository
public interface Repo extends MongoRepository<Product, Integer> {

    // declare method for findByCategory

   

    public List<Product> findByBrandAndRating(String brand, String rating);

    public List<Product> findByBrandAndPrice(String brand, int price);
    public List<Product> findByRating(String rating);

    public List<Product> findByCategoryAndBrand(String category, String brand);

    public List<Product> findByCategoryAndRating(String category, String rating);

    public List<Product> findByCategoryAndPrice(String category, int price);
    public List<Product> findByPriceBetween(int min, int max);
    
    public List<Product> findByBrand(String brand);
    public List<Product> findByCategory(String category);
    
    public List<Product> findByPrice(int price);
    public List<Product> findByPriceGreaterThan(int price);

    public List<Product> findByPriceLessThan(int price);
    public List<Product> findByPriceGreaterThanEqual(int price);

    
}

