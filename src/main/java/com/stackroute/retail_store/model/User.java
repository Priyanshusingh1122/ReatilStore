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
public class User {

// create a data model for retail store users with spring boot id field
// and other fields as name, email, password, role, phone, address
      @Id
        private String id;
        private Role role;
        private String name;
        private String email;
        private String password;
        private String phone;
        private String address;
}
