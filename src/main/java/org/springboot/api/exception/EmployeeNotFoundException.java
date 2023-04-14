package org.springboot.api.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(Integer id) {
        super("Employee not found " + id);
    }
}
