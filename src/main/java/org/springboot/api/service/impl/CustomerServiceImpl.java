package org.springboot.api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springboot.api.dto.Customer;
import org.springboot.api.entity.CustomerEntity;
import org.springboot.api.exception.CustomerNotFoundException;
import org.springboot.api.mapper.Mapper;
import org.springboot.api.repository.CustomerRespository;
import org.springboot.api.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRespository customerRespository;

    @Transactional
    public List<Customer> getAllCustomers() {

        return ((List<CustomerEntity>) customerRespository.findAll())
                .stream()
                .map(Mapper::map)
                .toList();
    }

    @Transactional
    public Customer getCustomerById(Integer id) {
        Optional<CustomerEntity> customer = customerRespository.findById(id);
        if (customer.isPresent()) {
            return Mapper.map(((CustomerEntity) customer.get()));
        }
        throw new CustomerNotFoundException(id);
    }
}
