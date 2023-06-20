package com.stackroute.retail_store.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.stackroute.retail_store.model.Product;

import java.util.List;

// Mark as Repository interface
// StockRepo to extend JpaRepository
@Repository
public interface Repo extends JpaRepository<Product, Integer> {

    // declare method for findByCategory
    public List<Product> findByCategory(String category);


    // create a method for finding products in given price range with custom query
    // write query to find products in given price range


    // declare method for findByPriceBetween



    public List<Product> findByPriceBetween(int min, int max);



    // declare method for findByBrand
// declare method for findByRating
// declare method for findByDiscount
// declare method for findByPrice
// declare method for findByCategoryAndBrand
// declare method for findByCategoryAndRating
// declare method for findByCategoryAndDiscount
// declare method for findByCategoryAndPrice
// declare method for findByBrandAndRating
// declare method for findByBrandAndDiscount
// declare method for findByBrandAndPrice
// declare method for findByRatingAndDiscount
// declare method for findByRatingAndPrice

}

