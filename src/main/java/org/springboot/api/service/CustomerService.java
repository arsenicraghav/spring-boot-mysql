package org.springboot.api.service;

import lombok.RequiredArgsConstructor;
import org.springboot.api.dto.Customer;
import org.springboot.api.entity.CustomerEntity;
import org.springboot.api.mapper.Mapper;
import org.springboot.api.repository.CustomerRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRespository customerRespository;

    public List<Customer> getAllCustomers() {

        return ((List<CustomerEntity>) customerRespository.findAll())
                .stream()
                .map(Mapper::map)
                .toList();
    }
}
