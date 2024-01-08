package com.example.wechatappplaygroundv2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "userAddressTesting")
public class UserAddressTesting {

    @Id
    private String id;


    @Field("street")
    private String street;
    @Field("city")
    private String city;
    @Field("zipCode")
    private String zipCode;


    // Getters and setters for all fields
    // Getter for street
    public String getStreet() {
        return street;
    }

    // Setter for street
    public void setStreet(String street) {
        this.street = street;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter for zipCode
    public String getZipCode() {
        return zipCode;
    }

    // Setter for zipCode
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
