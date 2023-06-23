package com.stackroute.retail_store.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

/**
 * @author Priyanshu Singh
 */

@Data
@Getter
@Setter

@Document(collection = "User")  

public class RetailUser {

// create a data model for retail store users with spring boot id field
// and other fields as name, email, password, role, phone, address

      @Id
        private int uid;
        private Role role;
        private String name;
        @Indexed(unique = true)
        private String emailId;
        private String password;
        private String phone;
        private String address;
}
