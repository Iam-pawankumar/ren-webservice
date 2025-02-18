package com.koder.ren_webservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class User {

    @Id
    @Column(unique = true, nullable = false)
    private String email;

    @Column(name = "user_name", unique = false, nullable = false)
    private String username;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile_number")
    private long mobileNumber;

    public User(){};

    public User(String username, String email, String address, long mobileNumber) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

}
