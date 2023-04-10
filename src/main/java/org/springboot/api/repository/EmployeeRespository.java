package org.springboot.api.repository;

import org.springboot.api.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRespository<P> extends CrudRepository<EmployeeEntity, Integer> {


}
