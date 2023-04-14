package org.springboot.api.service;

import org.springboot.api.dto.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(Integer id);
}
