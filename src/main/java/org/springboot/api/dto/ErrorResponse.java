package org.springboot.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

@Getter
@Builder
@AllArgsConstructor
public class ErrorResponse {
    private Timestamp timestamp;
    private
    HttpStatus status;
    private String message;
}
