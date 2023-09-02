package com.demoFirst_Spring_Project_023.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

    @JsonProperty("id")
    private int customerId;
    @JsonProperty("name")
    private String customerName;
    @JsonProperty("phone")
    private String customerPhone;

    public Customer(int id, String name, String phone) {
        this.customerId = id;
        this.customerName = name;
        this.customerPhone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return String.format("%s is customer with id %s and phone number %s",this.customerName,this.customerId,this.customerPhone);
    }
}
