package org.springboot.api.service;

import org.springboot.api.dto.Employee;
import org.springboot.api.entity.EmployeeEntity;
import org.springboot.api.mapper.Mapper;
import org.springboot.api.repository.EmployeeRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRespository employeeRespository;

    public List<Employee> getAllEmployee() {

        return ((List<EmployeeEntity>) employeeRespository.findAll())
                .stream()
                .map(Mapper::map)
                .toList();
    }
}
