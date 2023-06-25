package com.stackroute.retail_store.controller;

import com.stackroute.retail_store.service.CartService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Priyanshu Singh
 */
@WebMvcTest(CartController.class)
public class CartControllerTest {


    @MockBean
 private CartService cartService;


 @Autowired
 private MockMvc mockMvc;

 //    add test case for controller method to clear cart
 @Test
    public void testClearCart() throws Exception {
    mockMvc.perform(post("/api/v1/cart/clear/1"))
            .andExpect(status().isOk());
    }



// @Test
// public void testAddProductToCart() throws Exception {
//  mockMvc.perform(post("/api/v1/cart/1/products/1"))
//          .andExpect(status().isOk());
// }

}