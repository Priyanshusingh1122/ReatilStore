package com.stackroute.retail_store.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Priyanshu Singh
 */

@Data
@Getter
@Setter

public class OrderRequest {
 private String userId;
 private List<CartItem> products;
 private String deliveryAddress;
}
