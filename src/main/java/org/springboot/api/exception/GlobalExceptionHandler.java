package org.springboot.api.exception;

import org.springboot.api.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.Timestamp;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ErrorResponse accountNotFoundHandler(AccountNotFoundException e) {

        return ErrorResponse
                .builder()
                .timestamp(new Timestamp(System.currentTimeMillis()))
                .status(HttpStatus.NOT_FOUND)
                .message(e.getMessage())
                .build();
    }

    @ExceptionHandler(CustomerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ErrorResponse customerNotFoundHandler(CustomerNotFoundException e) {
        return ErrorResponse
                .builder()
                .timestamp(new Timestamp(System.currentTimeMillis()))
                .status(HttpStatus.NOT_FOUND)
                .message(e.getMessage())
                .build();
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ErrorResponse employeeNotFoundHandler(EmployeeNotFoundException e) {
        return ErrorResponse
                .builder()
                .timestamp(new Timestamp(System.currentTimeMillis()))
                .status(HttpStatus.NOT_FOUND)
                .message(e.getMessage())
                .build();
    }
}
