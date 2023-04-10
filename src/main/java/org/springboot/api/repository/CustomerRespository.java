package org.springboot.api.repository;

import org.springboot.api.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRespository<P> extends CrudRepository<CustomerEntity, Integer> {


}
