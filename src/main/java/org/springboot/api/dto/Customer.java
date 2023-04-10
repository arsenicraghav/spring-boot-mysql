package org.springboot.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Customer {

    int custId;
    String firstName;
    String lastName;
    int age;
    String email;
    long mobileNumber;
    String address;
    int empId;
}
