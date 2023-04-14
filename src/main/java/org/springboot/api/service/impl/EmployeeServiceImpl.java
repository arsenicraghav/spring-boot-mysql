package org.springboot.api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springboot.api.dto.Employee;
import org.springboot.api.entity.EmployeeEntity;
import org.springboot.api.exception.EmployeeNotFoundException;
import org.springboot.api.mapper.Mapper;
import org.springboot.api.repository.EmployeeRespository;
import org.springboot.api.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRespository employeeRespository;

    @Transactional
    public List<Employee> getAllEmployee() {

        return ((List<EmployeeEntity>) employeeRespository.findAll())
                .stream()
                .map(Mapper::map)
                .toList();
    }

    @Transactional
    public Employee getEmployeeById(Integer id) {
        Optional<EmployeeEntity> customer = employeeRespository.findById(id);
        if (customer.isPresent()) {
            return Mapper.map(((EmployeeEntity) customer.get()));
        }
        throw new EmployeeNotFoundException(id);
    }
}
