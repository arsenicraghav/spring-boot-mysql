package org.springboot.api.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springboot.api.dto.Employee;
import org.springboot.api.service.impl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1")
@RequiredArgsConstructor
@Tag(name = "Employee API")
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;

    @GetMapping(path = "/employees")
    public List<Employee> getEmployees() {
        return employeeServiceImpl.getAllEmployee();
    }

    @GetMapping(value = "/employees/{id}")
    public @ResponseBody Employee getEmployeeById(@PathVariable Integer id) {
        return employeeServiceImpl.getEmployeeById(id);
    }
}