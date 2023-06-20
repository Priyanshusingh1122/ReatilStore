package com.stackroute.retail_store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Priyanshu Singh
 */

@Data
@Getter
@Setter

@Entity
public class RetailUser {

// create a data model for retail store users with spring boot id field
// and other fields as name, email, password, role, phone, address

      @Id
        private int uid;
        private Role role;
        private String name;
        private String emailId;
        private String password;
        private String phone;
        private String address;
}
