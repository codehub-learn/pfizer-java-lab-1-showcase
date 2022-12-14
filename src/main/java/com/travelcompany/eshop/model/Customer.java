package com.travelcompany.eshop.model;

import com.travelcompany.eshop.model.enumeration.CustomerCategory;

public class Customer extends BaseEntity {
    private String name;
    private String email;
    private String address;
    private String nationality;
    private CustomerCategory category;

    public Customer(String name, String email, String address, String nationality, CustomerCategory category) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.nationality = nationality;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public CustomerCategory getCategory() {
        return category;
    }

    public void setCategory(CustomerCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", category=" + category +
                "} " + super.toString();
    }
}
