package com.demoFirst_Spring_Project_023.repository;

import com.demoFirst_Spring_Project_023.model.Customer;

import java.util.List;

public interface CustomerRepository {

    void createCustomer(Customer customer);
    String deleteCustomerById(int id);
    String updateCustomerName(int id, String name);
    String updateCustomerEmail(int id, String email);

    Customer getCustomerById(int id);
    //getCustomerByName
    List<Customer> getAllCustomers();
    List<String> getAllCustomerNames();

}
