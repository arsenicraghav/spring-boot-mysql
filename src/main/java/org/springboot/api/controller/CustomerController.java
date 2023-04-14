package org.springboot.api.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springboot.api.dto.Customer;
import org.springboot.api.service.impl.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerServiceImpl customerServiceImpl;

    @GetMapping(path = "/customers")
    public List<Customer> getCustomers() {
        return customerServiceImpl.getAllCustomers();
    }

    @GetMapping(value = "/customers/{id}")
    public @ResponseBody Customer getCustomerById(@PathVariable Integer id) {
        return customerServiceImpl.getCustomerById(id);
    }

}