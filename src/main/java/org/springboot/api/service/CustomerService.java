package org.springboot.api.service;

import org.springboot.api.dto.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomers();

    public Customer getCustomerById(Integer id);
}
