package com.stackroute.retail_store.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

/**
 * @author Priyanshu Singh
 */

@Data
@Getter
@Setter

// anotate for monngo db document
 @Document(collection = "Orders")
public class Order {
//   model class for orders with field orderId,list of Products, total price, delivery address, Date of order. Time of order



        @Id
        private UUID orderId = UUID.randomUUID();
        private String userId;
        private List<CartItem> products;
        private double totalPrice;
        private String deliveryAddress;
        private String dateOfOrder;
        private String timeOfOrder;



}
