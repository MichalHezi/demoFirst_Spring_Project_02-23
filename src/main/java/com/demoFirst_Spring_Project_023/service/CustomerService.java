package com.demoFirst_Spring_Project_023.service;

import com.demoFirst_Spring_Project_023.model.Customer;

import java.util.List;

public interface CustomerService {

    Integer createCustomer(Customer customer);
    String updateCustomerName(int id, String name);
    String deleteCustomerById(int id);
    String updateCustomerEmail(int id, String email);

    Customer getCustomerById(Integer id);
    //getCustomerByName
    List<Customer> getAllCustomers();
    List<String> getAllCustomerNames();
}
